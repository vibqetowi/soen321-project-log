package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.client.config.CookieSpecs;
/* compiled from: Stack.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/IntStack;", "", "()V", "size", "", "getSize", "()I", "slots", "", "tos", "clear", "", "indexOf", "value", "isEmpty", "", "isNotEmpty", "peek", FirebaseAnalytics.Param.INDEX, "peekOr", CookieSpecs.DEFAULT, "pop", "push", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntStack {
    private int[] slots = new int[10];
    private int tos;

    public final int getSize() {
        return this.tos;
    }

    public final void push(int i) {
        int i2 = this.tos;
        int[] iArr = this.slots;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.slots = copyOf;
        }
        int[] iArr2 = this.slots;
        int i3 = this.tos;
        this.tos = i3 + 1;
        iArr2[i3] = i;
    }

    public final int pop() {
        int[] iArr = this.slots;
        int i = this.tos - 1;
        this.tos = i;
        return iArr[i];
    }

    public final int peekOr(int i) {
        return this.tos > 0 ? peek() : i;
    }

    public final int peek() {
        return this.slots[this.tos - 1];
    }

    public final int peek(int i) {
        return this.slots[i];
    }

    public final boolean isEmpty() {
        return this.tos == 0;
    }

    public final boolean isNotEmpty() {
        return this.tos != 0;
    }

    public final void clear() {
        this.tos = 0;
    }

    public final int indexOf(int i) {
        int i2 = this.tos;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.slots[i3] == i) {
                return i3;
            }
        }
        return -1;
    }
}
