package com.google.api.client.http.javanet;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes7.dex */
public interface ConnectionFactory {
    HttpURLConnection openConnection(URL url) throws IOException, ClassCastException;
}
