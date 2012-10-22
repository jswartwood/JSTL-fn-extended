package org.apache.taglibs.extended;

import java.net.*;
import java.io.*;
import java.util.*;

public class FetchUrl {

  // Define the cache object
  static class UrlCacheEntry {
    public String value;
    public Date date;
  }

  // Define the cache as a WeakHasMap of dated content
  static WeakHashMap<String, UrlCacheEntry> urlCache = new WeakHashMap();

  // This is the function used in the JSTL extended lang
  // Returns the html response for a given `url` param
  public static String fetch(String url) throws Exception {
    // Now's date
    GregorianCalendar calendar = new GregorianCalendar();
    Date now = calendar.getTime();

    // First check the cache... does it exist? and is it recent enough?
    UrlCacheEntry cached = urlCache.get(url);
    if (cached != null && now.before(cached.date)) {
       return cached.value;
    }

    // Go fetch the URL
    URL page = new URL(url);
    URLConnection c = page.openConnection();
    BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));

    String content = "";
    String line;

    while ((line = in.readLine()) != null)
      content += line;
    in.close();

    // Tommorrow's date
    calendar.add(calendar.DAY_OF_MONTH, 1);
    Date tomorrow = calendar.getTime();

    // Saving cache entry for URL Fetch
    UrlCacheEntry entry = new UrlCacheEntry();
    entry.date = tomorrow;
    entry.value = content;
    urlCache.put(url, entry);

    return content;
  }
}
