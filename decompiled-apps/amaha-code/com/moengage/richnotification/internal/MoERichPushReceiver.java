package com.moengage.richnotification.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import hh.g;
import je.o;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import sj.m;
/* compiled from: MoERichPushReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/moengage/richnotification/internal/MoERichPushReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "rich-notification_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class MoERichPushReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final String f10257a = "RichPush_4.3.2_MoERichPushReceiver";

    /* compiled from: MoERichPushReceiver.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onReceive() : Will attempt to process intent", MoERichPushReceiver.this.f10257a);
        }
    }

    /* compiled from: MoERichPushReceiver.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onReceive() : ", MoERichPushReceiver.this.f10257a);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        i.g(context, "context");
        i.g(intent, "intent");
        try {
            hh.a aVar = g.f17610d;
            g.a.b(0, new a(), 3);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            di.b.v(extras, this.f10257a);
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            bh.b.a().submit(new o(13, new m(context, extras, action)));
        } catch (Throwable th2) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, th2, new b());
        }
    }
}
