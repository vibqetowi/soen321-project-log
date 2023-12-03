package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import java.io.Serializable;
import kotlin.jvm.internal.i;
/* compiled from: ActivityResultContract.kt */
/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* compiled from: ActivityResultContract.kt */
    /* renamed from: e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0212a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f13698a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0212a(Serializable serializable) {
            this.f13698a = serializable;
        }
    }

    public abstract Intent a(ComponentActivity componentActivity, Object obj);

    public C0212a b(ComponentActivity context, Object obj) {
        i.g(context, "context");
        return null;
    }

    public abstract Object c(Intent intent, int i6);
}
