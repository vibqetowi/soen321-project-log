package com.google.firebase.storage.network.connection;

import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes.dex */
public interface HttpURLConnectionFactory {
    HttpURLConnection createInstance(URL url);
}
