package com.google.firebase.storage.internal;

import aa.c;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import cd.b;
import com.google.firebase.storage.network.NetworkRequest;
import java.util.Random;
import kotlin.jvm.internal.b0;
import v9.o;
/* loaded from: classes.dex */
public class ExponentialBackoffSender {
    private static final int MAXIMUM_WAIT_TIME_MILLI = 30000;
    private static final int NETWORK_STATUS_POLL_INTERVAL = 1000;
    public static final int RND_MAX = 250;
    private static final String TAG = "ExponenentialBackoff";
    private final b appCheckProvider;
    private final gd.b authProvider;
    private volatile boolean canceled;
    private final Context context;
    private long retryTime;
    private static final Random random = new Random();
    static Sleeper sleeper = new SleeperImpl();
    static c clock = b0.f23449u;

    public ExponentialBackoffSender(Context context, gd.b bVar, b bVar2, long j10) {
        this.context = context;
        this.authProvider = bVar;
        this.appCheckProvider = bVar2;
        this.retryTime = j10;
    }

    public void cancel() {
        this.canceled = true;
    }

    public boolean isRetryableError(int i6) {
        if ((i6 < 500 || i6 >= 600) && i6 != -2 && i6 != 429 && i6 != 408) {
            return false;
        }
        return true;
    }

    public void reset() {
        this.canceled = false;
    }

    public void sendWithExponentialBackoff(NetworkRequest networkRequest) {
        sendWithExponentialBackoff(networkRequest, true);
    }

    public void sendWithExponentialBackoff(NetworkRequest networkRequest, boolean z10) {
        o.h(networkRequest);
        ((b0) clock).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + this.retryTime;
        if (z10) {
            networkRequest.performRequest(Util.getCurrentAuthToken(this.authProvider), Util.getCurrentAppCheckToken(this.appCheckProvider), this.context);
        } else {
            networkRequest.performRequestStart(Util.getCurrentAuthToken(this.authProvider), Util.getCurrentAppCheckToken(this.appCheckProvider));
        }
        int i6 = NETWORK_STATUS_POLL_INTERVAL;
        while (true) {
            ((b0) clock).getClass();
            if (SystemClock.elapsedRealtime() + i6 > elapsedRealtime || networkRequest.isResultSuccess() || !isRetryableError(networkRequest.getResultCode())) {
                return;
            }
            try {
                sleeper.sleep(random.nextInt(250) + i6);
                if (i6 < MAXIMUM_WAIT_TIME_MILLI) {
                    if (networkRequest.getResultCode() != -2) {
                        i6 *= 2;
                        Log.w(TAG, "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w(TAG, "network unavailable, sleeping.");
                        i6 = NETWORK_STATUS_POLL_INTERVAL;
                    }
                }
                if (this.canceled) {
                    return;
                }
                networkRequest.reset();
                if (z10) {
                    networkRequest.performRequest(Util.getCurrentAuthToken(this.authProvider), Util.getCurrentAppCheckToken(this.appCheckProvider), this.context);
                } else {
                    networkRequest.performRequestStart(Util.getCurrentAuthToken(this.authProvider), Util.getCurrentAppCheckToken(this.appCheckProvider));
                }
            } catch (InterruptedException unused) {
                Log.w(TAG, "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
