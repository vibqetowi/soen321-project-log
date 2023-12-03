package nn;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: IB3Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/l1;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l1 extends rn.b {

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f26542x = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f26541w = LogHelper.INSTANCE.makeLogTag(l1.class);

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.f26542x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_ib2, viewGroup, false);
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: Exception -> 0x0082, TryCatch #0 {Exception -> 0x0082, blocks: (B:3:0x0008, B:5:0x000f, B:8:0x001b, B:14:0x0027, B:16:0x002d, B:18:0x0061, B:20:0x0067, B:22:0x006d, B:24:0x0075, B:25:0x007a), top: B:30:0x0008 }] */
    @Override // rn.b, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z10;
        View view2;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            View view3 = null;
            if (arguments != null) {
                str = arguments.getString("ib3_image_android", "");
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                z10 = false;
                if (!z10 && getActivity() != null) {
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    com.bumptech.glide.f d10 = Glide.c(activity).d(activity);
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    com.bumptech.glide.e<Drawable> d11 = d10.d(new File(activity2.getFilesDir(), str));
                    LinkedHashMap linkedHashMap = this.f26542x;
                    view2 = (View) linkedHashMap.get(Integer.valueOf((int) R.id.ib2Image));
                    if (view2 == null) {
                        View view4 = getView();
                        if (view4 != null && (view2 = view4.findViewById(R.id.ib2Image)) != null) {
                            linkedHashMap.put(Integer.valueOf((int) R.id.ib2Image), view2);
                        }
                        d11.B((AppCompatImageView) view3);
                    }
                    view3 = view2;
                    d11.B((AppCompatImageView) view3);
                }
                F().U();
            }
            z10 = true;
            if (!z10) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.d(activity3);
                com.bumptech.glide.f d102 = Glide.c(activity3).d(activity3);
                androidx.fragment.app.p activity22 = getActivity();
                kotlin.jvm.internal.i.d(activity22);
                com.bumptech.glide.e<Drawable> d112 = d102.d(new File(activity22.getFilesDir(), str));
                LinkedHashMap linkedHashMap2 = this.f26542x;
                view2 = (View) linkedHashMap2.get(Integer.valueOf((int) R.id.ib2Image));
                if (view2 == null) {
                }
                view3 = view2;
                d112.B((AppCompatImageView) view3);
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26541w, e10);
        }
    }
}
