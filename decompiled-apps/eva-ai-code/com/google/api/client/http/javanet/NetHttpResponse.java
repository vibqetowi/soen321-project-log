package com.google.api.client.http.javanet;

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class NetHttpResponse extends LowLevelHttpResponse {
    private final HttpURLConnection connection;
    private final ArrayList<String> headerNames;
    private final ArrayList<String> headerValues;
    private final int responseCode;
    private final String responseMessage;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NetHttpResponse(HttpURLConnection httpURLConnection) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        this.headerNames = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.headerValues = arrayList2;
        this.connection = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        this.responseCode = responseCode == -1 ? 0 : responseCode;
        this.responseMessage = httpURLConnection.getResponseMessage();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                for (String str : entry.getValue()) {
                    if (str != null) {
                        arrayList.add(key);
                        arrayList2.add(str);
                    }
                }
            }
        }
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getStatusCode() {
        return this.responseCode;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public InputStream getContent() throws IOException {
        InputStream errorStream;
        try {
            errorStream = this.connection.getInputStream();
        } catch (IOException unused) {
            errorStream = this.connection.getErrorStream();
        }
        if (errorStream == null) {
            return null;
        }
        return new SizeValidatingInputStream(errorStream);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentEncoding() {
        return this.connection.getContentEncoding();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public long getContentLength() {
        String headerField = this.connection.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentType() {
        return this.connection.getHeaderField("Content-Type");
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getReasonPhrase() {
        return this.responseMessage;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getStatusLine() {
        String headerField = this.connection.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getHeaderCount() {
        return this.headerNames.size();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderName(int i) {
        return this.headerNames.get(i);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderValue(int i) {
        return this.headerValues.get(i);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public void disconnect() {
        this.connection.disconnect();
    }

    /* loaded from: classes7.dex */
    private final class SizeValidatingInputStream extends FilterInputStream {
        private long bytesRead;

        public SizeValidatingInputStream(InputStream inputStream) {
            super(inputStream);
            this.bytesRead = 0L;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.in.read(bArr, i, i2);
            if (read == -1) {
                throwIfFalseEOF();
            } else {
                this.bytesRead += read;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = this.in.read();
            if (read == -1) {
                throwIfFalseEOF();
            } else {
                this.bytesRead++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long skip = this.in.skip(j);
            this.bytesRead += skip;
            return skip;
        }

        private void throwIfFalseEOF() throws IOException {
            long contentLength = NetHttpResponse.this.getContentLength();
            if (contentLength == -1) {
                return;
            }
            long j = this.bytesRead;
            if (j == 0 || j >= contentLength) {
                return;
            }
            throw new IOException("Connection closed prematurely: bytesRead = " + this.bytesRead + ", Content-Length = " + contentLength);
        }
    }
}
