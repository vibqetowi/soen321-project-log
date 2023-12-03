package com.google.firebase.storage.network;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.storage.StorageException;
import com.google.firebase.storage.internal.StorageReferenceUri;
import com.google.firebase.storage.network.connection.HttpURLConnectionFactory;
import com.google.firebase.storage.network.connection.HttpURLConnectionFactoryImpl;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sc.e;
import v9.o;
import ya.i;
import zd.a;
/* loaded from: classes.dex */
public abstract class NetworkRequest {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String APPLICATION_JSON = "application/json";
    private static final String CONTENT_LENGTH = "Content-Length";
    private static final String CONTENT_TYPE = "Content-Type";
    static final String DELETE = "DELETE";
    static final String GET = "GET";
    public static final int INITIALIZATION_EXCEPTION = -1;
    private static final int MAXIMUM_TOKEN_WAIT_TIME_MS = 30000;
    public static final int NETWORK_UNAVAILABLE = -2;
    static final String PATCH = "PATCH";
    static final String POST = "POST";
    static final String PUT = "PUT";
    private static final String TAG = "NetworkRequest";
    private static final String UTF_8 = "UTF-8";
    private static final String X_FIREBASE_APPCHECK = "x-firebase-appcheck";
    private static final String X_FIREBASE_GMPID = "x-firebase-gmpid";
    private static String gmsCoreVersion;
    private HttpURLConnection connection;
    private Context context;
    protected Exception mException;
    private String rawStringResponse;
    private Map<String, String> requestHeaders = new HashMap();
    private int resultCode;
    private Map<String, List<String>> resultHeaders;
    private InputStream resultInputStream;
    private int resultingContentLength;
    private StorageReferenceUri storageReferenceUri;
    public static final Uri PROD_BASE_URL = Uri.parse("https://firebasestorage.googleapis.com/v0");
    static HttpURLConnectionFactory connectionFactory = new HttpURLConnectionFactoryImpl();

    public NetworkRequest(StorageReferenceUri storageReferenceUri, e eVar) {
        o.h(storageReferenceUri);
        o.h(eVar);
        this.storageReferenceUri = storageReferenceUri;
        eVar.b();
        this.context = eVar.f31432a;
        eVar.b();
        setCustomHeader(X_FIREBASE_GMPID, eVar.f31434c.f31445b);
    }

    private void constructMessage(HttpURLConnection httpURLConnection, String str, String str2) {
        byte[] outputRaw;
        int outputRawSize;
        o.h(httpURLConnection);
        if (!TextUtils.isEmpty(str)) {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        } else {
            Log.w(TAG, "no auth token for request");
        }
        if (!TextUtils.isEmpty(str2)) {
            httpURLConnection.setRequestProperty(X_FIREBASE_APPCHECK, str2);
        } else {
            Log.w(TAG, "No App Check token for request.");
        }
        StringBuilder sb2 = new StringBuilder("Android/");
        String gmsCoreVersion2 = getGmsCoreVersion(this.context);
        if (!TextUtils.isEmpty(gmsCoreVersion2)) {
            sb2.append(gmsCoreVersion2);
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", sb2.toString());
        for (Map.Entry<String, String> entry : this.requestHeaders.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject outputJSON = getOutputJSON();
        if (outputJSON != null) {
            outputRaw = outputJSON.toString().getBytes(UTF_8);
            outputRawSize = outputRaw.length;
        } else {
            outputRaw = getOutputRaw();
            outputRawSize = getOutputRawSize();
            if (outputRawSize == 0 && outputRaw != null) {
                outputRawSize = outputRaw.length;
            }
        }
        if (outputRaw != null && outputRaw.length > 0) {
            if (outputJSON != null) {
                httpURLConnection.setRequestProperty(CONTENT_TYPE, APPLICATION_JSON);
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(CONTENT_LENGTH, Integer.toString(outputRawSize));
        } else {
            httpURLConnection.setRequestProperty(CONTENT_LENGTH, "0");
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (outputRaw != null && outputRaw.length > 0) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            if (outputStream != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                try {
                    bufferedOutputStream.write(outputRaw, 0, outputRawSize);
                    return;
                } finally {
                    bufferedOutputStream.close();
                }
            }
            Log.e(TAG, "Unable to write to the http request!");
        }
    }

    private HttpURLConnection createConnection() {
        Uri url = getURL();
        Map<String, String> queryParameters = getQueryParameters();
        if (queryParameters != null) {
            Uri.Builder buildUpon = url.buildUpon();
            for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            url = buildUpon.build();
        }
        return connectionFactory.createInstance(new URL(url.toString()));
    }

    private boolean ensureNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.mException = new SocketException("Network subsystem is unavailable");
        this.resultCode = -2;
        return false;
    }

    public static Uri getBaseUrl(a aVar) {
        if (aVar != null) {
            return Uri.parse("http://" + aVar.f39363a + ":" + aVar.f39364b + "/v0");
        }
        return PROD_BASE_URL;
    }

    private static String getGmsCoreVersion(Context context) {
        if (gmsCoreVersion == null) {
            try {
                gmsCoreVersion = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(TAG, "Unable to find gmscore in package manager", e10);
            }
            if (gmsCoreVersion == null) {
                gmsCoreVersion = "[No Gmscore]";
            }
        }
        return gmsCoreVersion;
    }

    private static String getPathWithoutBucket(Uri uri) {
        String path = uri.getPath();
        return path == null ? "" : path.startsWith("/") ? path.substring(1) : path;
    }

    private void parseResponse(HttpURLConnection httpURLConnection) {
        o.h(httpURLConnection);
        this.resultCode = httpURLConnection.getResponseCode();
        this.resultHeaders = httpURLConnection.getHeaderFields();
        this.resultingContentLength = httpURLConnection.getContentLength();
        if (isResultSuccess()) {
            this.resultInputStream = httpURLConnection.getInputStream();
        } else {
            this.resultInputStream = httpURLConnection.getErrorStream();
        }
    }

    private final void performRequest(String str, String str2) {
        performRequestStart(str, str2);
        try {
            processResponseStream();
        } catch (IOException e10) {
            Log.w(TAG, "error sending network request " + getAction() + " " + getURL(), e10);
            this.mException = e10;
            this.resultCode = -2;
        }
        performRequestEnd();
    }

    private void processResponseStream() {
        if (isResultSuccess()) {
            parseSuccessulResponse(this.resultInputStream);
        } else {
            parseErrorResponse(this.resultInputStream);
        }
    }

    public <TResult> void completeTask(i<TResult> iVar, TResult tresult) {
        Exception exception = getException();
        if (isResultSuccess() && exception == null) {
            iVar.b(tresult);
        } else {
            iVar.a(StorageException.fromExceptionAndHttpCode(exception, getResultCode()));
        }
    }

    public abstract String getAction();

    public Exception getException() {
        return this.mException;
    }

    public JSONObject getOutputJSON() {
        return null;
    }

    public byte[] getOutputRaw() {
        return null;
    }

    public int getOutputRawSize() {
        return 0;
    }

    public Map<String, String> getQueryParameters() {
        return null;
    }

    public String getRawResult() {
        return this.rawStringResponse;
    }

    public JSONObject getResultBody() {
        if (!TextUtils.isEmpty(this.rawStringResponse)) {
            try {
                return new JSONObject(this.rawStringResponse);
            } catch (JSONException e10) {
                Log.e(TAG, "error parsing result into JSON:" + this.rawStringResponse, e10);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public Map<String, String> getResultHeaders() {
        return this.requestHeaders;
    }

    public Map<String, List<String>> getResultHeadersImpl() {
        return this.resultHeaders;
    }

    public String getResultString(String str) {
        List<String> list;
        Map<String, List<String>> resultHeadersImpl = getResultHeadersImpl();
        if (resultHeadersImpl != null && (list = resultHeadersImpl.get(str)) != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public int getResultingContentLength() {
        return this.resultingContentLength;
    }

    public StorageReferenceUri getStorageReferenceUri() {
        return this.storageReferenceUri;
    }

    public InputStream getStream() {
        return this.resultInputStream;
    }

    public Uri getURL() {
        return this.storageReferenceUri.getHttpUri();
    }

    public boolean isResultSuccess() {
        int i6 = this.resultCode;
        if (i6 >= 200 && i6 < 300) {
            return true;
        }
        return false;
    }

    public void parseErrorResponse(InputStream inputStream) {
        parseResponse(inputStream);
    }

    public void parseSuccessulResponse(InputStream inputStream) {
        parseResponse(inputStream);
    }

    public void performRequestEnd() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void performRequestStart(String str, String str2) {
        if (this.mException != null) {
            this.resultCode = -1;
            return;
        }
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "sending network request " + getAction() + " " + getURL());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            try {
                HttpURLConnection createConnection = createConnection();
                this.connection = createConnection;
                createConnection.setRequestMethod(getAction());
                constructMessage(this.connection, str, str2);
                parseResponse(this.connection);
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "network request result " + this.resultCode);
                    return;
                }
                return;
            } catch (IOException e10) {
                Log.w(TAG, "error sending network request " + getAction() + " " + getURL(), e10);
                this.mException = e10;
                this.resultCode = -2;
                return;
            }
        }
        this.resultCode = -2;
        this.mException = new SocketException("Network subsystem is unavailable");
    }

    public final void reset() {
        this.mException = null;
        this.resultCode = 0;
    }

    public void setCustomHeader(String str, String str2) {
        this.requestHeaders.put(str, str2);
    }

    public String getPathWithoutBucket() {
        return getPathWithoutBucket(this.storageReferenceUri.getGsUri());
    }

    public void performRequest(String str, String str2, Context context) {
        if (ensureNetworkAvailable(context)) {
            performRequest(str, str2);
        }
    }

    private void parseResponse(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, UTF_8));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.rawStringResponse = sb2.toString();
        if (isResultSuccess()) {
            return;
        }
        this.mException = new IOException(this.rawStringResponse);
    }
}
