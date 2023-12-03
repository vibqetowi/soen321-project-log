package com.google.firebase.storage.network.connection;

import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes.dex */
public class HttpURLConnectionFactoryImpl implements HttpURLConnectionFactory {
    @Override // com.google.firebase.storage.network.connection.HttpURLConnectionFactory
    public HttpURLConnection createInstance(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
