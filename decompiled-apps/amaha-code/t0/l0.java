package t0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import t0.d0;
import wu.n1;
import wu.x0;
/* compiled from: View.kt */
/* loaded from: classes.dex */
public final class l0 implements uf.l, yt.u {

    /* renamed from: u  reason: collision with root package name */
    public static final String[] f32336u = {"_id", "key", "value", ServerValues.NAME_OP_TIMESTAMP};

    /* renamed from: v  reason: collision with root package name */
    public static final String[] f32337v = {"_id", ServerValues.NAME_OP_TIMESTAMP, "request_id", "payload"};

    /* renamed from: w  reason: collision with root package name */
    public static final String[] f32338w = {"_id", Constants.CAMPAIGN_ID, "type", "status", "state", "priority", "last_updated_time", "template_type", "deletion_time", "last_received_time", "campaign_meta"};

    /* renamed from: x  reason: collision with root package name */
    public static final l0 f32339x = new l0();

    public static /* synthetic */ void c(int i6) {
        Object[] objArr = new Object[3];
        switch (i6) {
            case 1:
            case 4:
                objArr[0] = Constants.ONBOARDING_VARIANT;
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i6) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean d(x0 x0Var, x0 x0Var2) {
        if (x0Var != null) {
            if (x0Var2 != null) {
                return x0Var.equals(x0Var2);
            }
            c(4);
            throw null;
        }
        c(3);
        throw null;
    }

    public static final void e(View view) {
        kotlin.jvm.internal.i.g(view, "<this>");
        k0 k0Var = new k0(view, null);
        fv.i iVar = new fv.i();
        iVar.f15982x = ca.a.M(iVar, iVar, k0Var);
        while (iVar.hasNext()) {
            View view2 = (View) iVar.next();
            y0.b bVar = (y0.b) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (bVar == null) {
                bVar = new y0.b();
                view2.setTag(R.id.pooling_container_listener_holder_tag, bVar);
            }
            ArrayList<y0.a> arrayList = bVar.f38185a;
            for (int l02 = ca.a.l0(arrayList); -1 < l02; l02--) {
                arrayList.get(l02).a();
            }
        }
    }

    public static final int g(n1 n1Var) {
        int ordinal = n1Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 1;
            }
            if (ordinal == 2) {
                return 2;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 3;
    }

    public static Bitmap h(View view) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        kotlin.jvm.internal.i.g(view, "<this>");
        kotlin.jvm.internal.i.g(config, "config");
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.g.c(view)) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            kotlin.jvm.internal.i.f(createBitmap, "createBitmap(width, height, config)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    @Override // yt.u
    public void b(gt.e classDescriptor) {
        kotlin.jvm.internal.i.g(classDescriptor, "classDescriptor");
    }

    public wu.b0 f(LinkedHashSet types) {
        kotlin.jvm.internal.i.g(types, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: ".concat(is.u.m2(types, null, null, null, null, 63)));
    }

    @Override // uf.l
    public Object i() {
        return new LinkedHashMap();
    }

    @Override // yt.u
    public void a(gt.e eVar) {
    }
}
