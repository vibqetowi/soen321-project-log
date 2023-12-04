package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* compiled from: SplitPairFilter.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "primaryActivityName", "Landroid/content/ComponentName;", "secondaryActivityName", "secondaryActivityIntentAction", "", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "getSecondaryActivityIntentAction", "()Ljava/lang/String;", "getSecondaryActivityName", "equals", "", "other", "hashCode", "", "matchesActivityIntentPair", "primaryActivity", "Landroid/app/Activity;", "secondaryActivityIntent", "Landroid/content/Intent;", "matchesActivityPair", "secondaryActivity", "toString", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SplitPairFilter(ComponentName primaryActivityName, ComponentName secondaryActivityName, String str) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        Intrinsics.checkNotNullParameter(primaryActivityName, "primaryActivityName");
        Intrinsics.checkNotNullParameter(secondaryActivityName, "secondaryActivityName");
        this.primaryActivityName = primaryActivityName;
        this.secondaryActivityName = secondaryActivityName;
        this.secondaryActivityIntentAction = str;
        String packageName = primaryActivityName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "primaryActivityName.packageName");
        String className = primaryActivityName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "primaryActivityName.className");
        String packageName2 = secondaryActivityName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "secondaryActivityName.packageName");
        String className2 = secondaryActivityName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "secondaryActivityName.className");
        String str2 = packageName;
        boolean z4 = true;
        if (!(str2.length() == 0)) {
            if (!(packageName2.length() == 0)) {
                z = true;
                if (z) {
                    throw new IllegalArgumentException("Package name must not be empty".toString());
                }
                String str3 = className;
                if (!(str3.length() == 0)) {
                    if (!(className2.length() == 0)) {
                        z2 = true;
                        if (z2) {
                            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
                        }
                        if (!(!StringsKt.contains$default((CharSequence) str2, (CharSequence) WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD, false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) str2, WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD, 0, false, 6, (Object) null) == packageName.length() - 1)) {
                            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                        }
                        if (StringsKt.contains$default((CharSequence) str3, (CharSequence) WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD, false, 2, (Object) null)) {
                            i = 2;
                            if (StringsKt.indexOf$default((CharSequence) str3, WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD, 0, false, 6, (Object) null) != className.length() - 1) {
                                z3 = false;
                                if (z3) {
                                    throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                                }
                                String str4 = packageName2;
                                if (!(!StringsKt.contains$default((CharSequence) str4, (CharSequence) WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD, false, i, (Object) null) || StringsKt.indexOf$default((CharSequence) str4, WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD, 0, false, 6, (Object) null) == packageName2.length() - 1)) {
                                    throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                                }
                                String str5 = className2;
                                if (StringsKt.contains$default((CharSequence) str5, (CharSequence) WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD, false, i, (Object) null) && StringsKt.indexOf$default((CharSequence) str5, WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD, 0, false, 6, (Object) null) != className2.length() - 1) {
                                    z4 = false;
                                }
                                if (!z4) {
                                    throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                                }
                                return;
                            }
                        } else {
                            i = 2;
                        }
                        z3 = true;
                        if (z3) {
                        }
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
        }
        z = false;
        if (z) {
        }
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (matchesActivityIntentPair(r6, r7) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean matchesActivityPair(Activity primaryActivity, Activity secondaryActivity) {
        Intrinsics.checkNotNullParameter(primaryActivity, "primaryActivity");
        Intrinsics.checkNotNullParameter(secondaryActivity, "secondaryActivity");
        boolean z = true;
        boolean z2 = MatcherUtils.INSTANCE.areComponentsMatching$window_release(primaryActivity.getComponentName(), this.primaryActivityName) && MatcherUtils.INSTANCE.areComponentsMatching$window_release(secondaryActivity.getComponentName(), this.secondaryActivityName);
        if (secondaryActivity.getIntent() != null) {
            if (z2) {
                Intent intent = secondaryActivity.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "secondaryActivity.intent");
            }
            z = false;
            return z;
        }
        return z2;
    }

    public final boolean matchesActivityIntentPair(Activity primaryActivity, Intent secondaryActivityIntent) {
        Intrinsics.checkNotNullParameter(primaryActivity, "primaryActivity");
        Intrinsics.checkNotNullParameter(secondaryActivityIntent, "secondaryActivityIntent");
        if (MatcherUtils.INSTANCE.areComponentsMatching$window_release(primaryActivity.getComponentName(), this.primaryActivityName) && MatcherUtils.INSTANCE.areComponentsMatching$window_release(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            String str = this.secondaryActivityIntentAction;
            return str == null || Intrinsics.areEqual(str, secondaryActivityIntent.getAction());
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SplitPairFilter) {
            SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
            return Intrinsics.areEqual(this.primaryActivityName, splitPairFilter.primaryActivityName) && Intrinsics.areEqual(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && Intrinsics.areEqual(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityIntentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityIntentAction) + AbstractJsonLexerKt.END_OBJ;
    }
}
