package com.theinnerhour.b2b.utils;

import android.content.Intent;
import com.appsflyer.R;
import kotlin.Metadata;
/* compiled from: RoutingIntentHandler.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/theinnerhour/b2b/utils/RoutingIntentHandler;", "", "intent", "Landroid/content/Intent;", "routingType", "Lcom/theinnerhour/b2b/utils/RoutingType;", "isRoutingCompleted", "", "(Landroid/content/Intent;Lcom/theinnerhour/b2b/utils/RoutingType;Z)V", "getIntent", "()Landroid/content/Intent;", "()Z", "setRoutingCompleted", "(Z)V", "getRoutingType", "()Lcom/theinnerhour/b2b/utils/RoutingType;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class RoutingIntentHandler {
    private final Intent intent;
    private boolean isRoutingCompleted;
    private final RoutingType routingType;

    public RoutingIntentHandler(Intent intent, RoutingType routingType, boolean z10) {
        this.intent = intent;
        this.routingType = routingType;
        this.isRoutingCompleted = z10;
    }

    public static /* synthetic */ RoutingIntentHandler copy$default(RoutingIntentHandler routingIntentHandler, Intent intent, RoutingType routingType, boolean z10, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            intent = routingIntentHandler.intent;
        }
        if ((i6 & 2) != 0) {
            routingType = routingIntentHandler.routingType;
        }
        if ((i6 & 4) != 0) {
            z10 = routingIntentHandler.isRoutingCompleted;
        }
        return routingIntentHandler.copy(intent, routingType, z10);
    }

    public final Intent component1() {
        return this.intent;
    }

    public final RoutingType component2() {
        return this.routingType;
    }

    public final boolean component3() {
        return this.isRoutingCompleted;
    }

    public final RoutingIntentHandler copy(Intent intent, RoutingType routingType, boolean z10) {
        return new RoutingIntentHandler(intent, routingType, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutingIntentHandler)) {
            return false;
        }
        RoutingIntentHandler routingIntentHandler = (RoutingIntentHandler) obj;
        if (kotlin.jvm.internal.i.b(this.intent, routingIntentHandler.intent) && this.routingType == routingIntentHandler.routingType && this.isRoutingCompleted == routingIntentHandler.isRoutingCompleted) {
            return true;
        }
        return false;
    }

    public final Intent getIntent() {
        return this.intent;
    }

    public final RoutingType getRoutingType() {
        return this.routingType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        Intent intent = this.intent;
        int i6 = 0;
        if (intent == null) {
            hashCode = 0;
        } else {
            hashCode = intent.hashCode();
        }
        int i10 = hashCode * 31;
        RoutingType routingType = this.routingType;
        if (routingType != null) {
            i6 = routingType.hashCode();
        }
        int i11 = (i10 + i6) * 31;
        boolean z10 = this.isRoutingCompleted;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        return i11 + i12;
    }

    public final boolean isRoutingCompleted() {
        return this.isRoutingCompleted;
    }

    public final void setRoutingCompleted(boolean z10) {
        this.isRoutingCompleted = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RoutingIntentHandler(intent=");
        sb2.append(this.intent);
        sb2.append(", routingType=");
        sb2.append(this.routingType);
        sb2.append(", isRoutingCompleted=");
        return defpackage.c.t(sb2, this.isRoutingCompleted, ')');
    }

    public /* synthetic */ RoutingIntentHandler(Intent intent, RoutingType routingType, boolean z10, int i6, kotlin.jvm.internal.d dVar) {
        this(intent, routingType, (i6 & 4) != 0 ? false : z10);
    }
}
