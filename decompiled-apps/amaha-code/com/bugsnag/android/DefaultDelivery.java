package com.bugsnag.android;

import android.net.TrafficStats;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.JsonHelper;
import com.bugsnag.android.internal.TrimMetrics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.theinnerhour.b2b.utils.Constants;
import gv.a;
import hs.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import sp.b;
/* compiled from: DefaultDelivery.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B)\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\n\u0012\u0006\u0010%\u001a\u00020\u000e\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J,\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/bugsnag/android/DefaultDelivery;", "Lcom/bugsnag/android/Delivery;", "Lcom/bugsnag/android/EventPayload;", "payload", "", "serializePayload", "Ljava/net/URL;", Constants.NOTIFICATION_URL, "json", "", "", "headers", "Ljava/net/HttpURLConnection;", "makeRequest", "", "code", "conn", "Lcom/bugsnag/android/DeliveryStatus;", "status", "Lhs/k;", "logRequestInfo", "responseCode", "", "isUnrecoverableStatusCode", "Lcom/bugsnag/android/Session;", "Lcom/bugsnag/android/DeliveryParams;", "deliveryParams", "deliver", "urlString", "getDeliveryStatus$bugsnag_android_core_release", "(I)Lcom/bugsnag/android/DeliveryStatus;", "getDeliveryStatus", "Lcom/bugsnag/android/Connectivity;", "connectivity", "Lcom/bugsnag/android/Connectivity;", "apiKey", "Ljava/lang/String;", "maxStringValueLength", "I", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "<init>", "(Lcom/bugsnag/android/Connectivity;Ljava/lang/String;ILcom/bugsnag/android/Logger;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DefaultDelivery implements Delivery {
    public static final Companion Companion = new Companion(null);
    public static final int maxPayloadSize = 999700;
    private final String apiKey;
    private final Connectivity connectivity;
    private final Logger logger;
    private final int maxStringValueLength;

    /* compiled from: DefaultDelivery.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/DefaultDelivery$Companion;", "", "()V", "maxPayloadSize", "", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    public DefaultDelivery(Connectivity connectivity, String apiKey, int i6, Logger logger) {
        i.h(apiKey, "apiKey");
        i.h(logger, "logger");
        this.connectivity = connectivity;
        this.apiKey = apiKey;
        this.maxStringValueLength = i6;
        this.logger = logger;
    }

    private final boolean isUnrecoverableStatusCode(int i6) {
        if (400 <= i6 && 499 >= i6 && i6 != 408 && i6 != 429) {
            return true;
        }
        return false;
    }

    private final void logRequestInfo(int i6, HttpURLConnection httpURLConnection, DeliveryStatus deliveryStatus) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        try {
            Logger logger = this.logger;
            logger.i("Request completed with code " + i6 + ", message: " + httpURLConnection.getResponseMessage() + ", headers: " + httpURLConnection.getHeaderFields());
            k kVar = k.f19476a;
        } catch (Throwable th2) {
            b.j(th2);
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            i.c(inputStream, "conn.inputStream");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, a.f16927b);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader2 = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader2 = new BufferedReader(inputStreamReader, 8192);
            }
            this.logger.d("Received request response: ".concat(ca.a.c1(bufferedReader2)));
            k kVar2 = k.f19476a;
            ca.a.z(bufferedReader2, null);
        } catch (Throwable th3) {
            b.j(th3);
        }
        try {
            if (deliveryStatus != DeliveryStatus.DELIVERED) {
                InputStream errorStream = httpURLConnection.getErrorStream();
                i.c(errorStream, "conn.errorStream");
                InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, a.f16927b);
                if (inputStreamReader2 instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader2;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader2, 8192);
                }
                this.logger.w("Request error details: ".concat(ca.a.c1(bufferedReader)));
                k kVar3 = k.f19476a;
                ca.a.z(bufferedReader, null);
            }
            k kVar4 = k.f19476a;
        } catch (Throwable th4) {
            b.j(th4);
        }
    }

    private final HttpURLConnection makeRequest(URL url, byte[] bArr, Map<String, String> map) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        if (uRLConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            String computeSha1Digest = DeliveryHeadersKt.computeSha1Digest(bArr);
            if (computeSha1Digest != null) {
                httpURLConnection.addRequestProperty(DeliveryHeadersKt.HEADER_BUGSNAG_INTEGRITY, computeSha1Digest);
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value != null) {
                    httpURLConnection.addRequestProperty(key, value);
                }
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(bArr);
                k kVar = k.f19476a;
                ca.a.z(outputStream, null);
                return httpURLConnection;
            } finally {
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
    }

    private final byte[] serializePayload(EventPayload eventPayload) {
        JsonHelper jsonHelper = JsonHelper.INSTANCE;
        byte[] serialize = jsonHelper.serialize((JsonStream.Streamable) eventPayload);
        if (serialize.length <= 999700) {
            return serialize;
        }
        Event event = eventPayload.getEvent();
        if (event == null) {
            File eventFile$bugsnag_android_core_release = eventPayload.getEventFile$bugsnag_android_core_release();
            if (eventFile$bugsnag_android_core_release != null) {
                event = new MarshalledEventSource(eventFile$bugsnag_android_core_release, this.apiKey, this.logger).invoke();
                eventPayload.setEvent$bugsnag_android_core_release(event);
                eventPayload.setApiKey(this.apiKey);
            } else {
                i.o();
                throw null;
            }
        }
        TrimMetrics trimMetadataStringsTo = event.getImpl().trimMetadataStringsTo(this.maxStringValueLength);
        event.getImpl().getInternalMetrics().setMetadataTrimMetrics(trimMetadataStringsTo.component1(), trimMetadataStringsTo.component2());
        byte[] serialize2 = jsonHelper.serialize((JsonStream.Streamable) eventPayload);
        if (serialize2.length <= 999700) {
            return serialize2;
        }
        TrimMetrics trimBreadcrumbsBy = event.getImpl().trimBreadcrumbsBy(serialize2.length - maxPayloadSize);
        event.getImpl().getInternalMetrics().setBreadcrumbTrimMetrics(trimBreadcrumbsBy.getItemsTrimmed(), trimBreadcrumbsBy.getDataTrimmed());
        return jsonHelper.serialize((JsonStream.Streamable) eventPayload);
    }

    @Override // com.bugsnag.android.Delivery
    public DeliveryStatus deliver(Session payload, DeliveryParams deliveryParams) {
        i.h(payload, "payload");
        i.h(deliveryParams, "deliveryParams");
        DeliveryStatus deliver = deliver(deliveryParams.getEndpoint(), JsonHelper.INSTANCE.serialize((JsonStream.Streamable) payload), deliveryParams.getHeaders());
        Logger logger = this.logger;
        logger.i("Session API request finished with status " + deliver);
        return deliver;
    }

    public final DeliveryStatus getDeliveryStatus$bugsnag_android_core_release(int i6) {
        if (200 <= i6 && 299 >= i6) {
            return DeliveryStatus.DELIVERED;
        }
        if (isUnrecoverableStatusCode(i6)) {
            return DeliveryStatus.FAILURE;
        }
        return DeliveryStatus.UNDELIVERED;
    }

    @Override // com.bugsnag.android.Delivery
    public DeliveryStatus deliver(EventPayload payload, DeliveryParams deliveryParams) {
        i.h(payload, "payload");
        i.h(deliveryParams, "deliveryParams");
        DeliveryStatus deliver = deliver(deliveryParams.getEndpoint(), serializePayload(payload), deliveryParams.getHeaders());
        Logger logger = this.logger;
        logger.i("Error API request finished with status " + deliver);
        return deliver;
    }

    public final DeliveryStatus deliver(String urlString, byte[] json, Map<String, String> headers) {
        i.h(urlString, "urlString");
        i.h(json, "json");
        i.h(headers, "headers");
        TrafficStats.setThreadStatsTag(1);
        Connectivity connectivity = this.connectivity;
        if (connectivity != null && !connectivity.hasNetworkConnection()) {
            return DeliveryStatus.UNDELIVERED;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    httpURLConnection = makeRequest(new URL(urlString), json, headers);
                    int responseCode = httpURLConnection.getResponseCode();
                    DeliveryStatus deliveryStatus$bugsnag_android_core_release = getDeliveryStatus$bugsnag_android_core_release(responseCode);
                    logRequestInfo(responseCode, httpURLConnection, deliveryStatus$bugsnag_android_core_release);
                    httpURLConnection.disconnect();
                    return deliveryStatus$bugsnag_android_core_release;
                } catch (IOException e10) {
                    this.logger.w("IOException encountered in request", e10);
                    DeliveryStatus deliveryStatus = DeliveryStatus.UNDELIVERED;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return deliveryStatus;
                }
            } catch (Exception e11) {
                this.logger.w("Unexpected error delivering payload", e11);
                DeliveryStatus deliveryStatus2 = DeliveryStatus.FAILURE;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return deliveryStatus2;
            } catch (OutOfMemoryError e12) {
                this.logger.w("Encountered OOM delivering payload, falling back to persist on disk", e12);
                DeliveryStatus deliveryStatus3 = DeliveryStatus.UNDELIVERED;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return deliveryStatus3;
            }
        } catch (Throwable th2) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }
}
