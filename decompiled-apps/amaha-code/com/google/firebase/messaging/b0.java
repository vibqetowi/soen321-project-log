package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: SharedPreferencesQueue.java */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f9680a;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f9684e;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<String> f9683d = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    public final String f9681b = "topic_operation_queue";

    /* renamed from: c  reason: collision with root package name */
    public final String f9682c = ",";

    public b0(SharedPreferences sharedPreferences, Executor executor) {
        this.f9680a = sharedPreferences;
        this.f9684e = executor;
    }

    public static b0 a(SharedPreferences sharedPreferences, Executor executor) {
        b0 b0Var = new b0(sharedPreferences, executor);
        synchronized (b0Var.f9683d) {
            b0Var.f9683d.clear();
            String string = b0Var.f9680a.getString(b0Var.f9681b, "");
            if (!TextUtils.isEmpty(string) && string.contains(b0Var.f9682c)) {
                String[] split = string.split(b0Var.f9682c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        b0Var.f9683d.add(str);
                    }
                }
            }
        }
        return b0Var;
    }

    public final String b() {
        String peek;
        synchronized (this.f9683d) {
            peek = this.f9683d.peek();
        }
        return peek;
    }

    public final boolean c(String str) {
        boolean remove;
        synchronized (this.f9683d) {
            remove = this.f9683d.remove(str);
            if (remove) {
                this.f9684e.execute(new je.o(8, this));
            }
        }
        return remove;
    }
}
