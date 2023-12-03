package nn;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: AB1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/a;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends rn.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f26415y = 0;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f26417x = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f26416w = LogHelper.INSTANCE.makeLogTag(a.class);

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.f26417x.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26417x;
        Integer valueOf = Integer.valueOf((int) R.id.ab1Lottie);
        View view = (View) linkedHashMap.get(valueOf);
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(R.id.ab1Lottie)) != null) {
                linkedHashMap.put(valueOf, findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_ab1, viewGroup, false);
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[Catch: Exception -> 0x00e9, TryCatch #2 {Exception -> 0x00e9, blocks: (B:6:0x0019, B:8:0x0022, B:10:0x002a, B:16:0x0041, B:22:0x004d, B:24:0x0053, B:26:0x0059, B:28:0x005f, B:32:0x0068, B:34:0x008a, B:42:0x00c6, B:35:0x008d, B:49:0x00e1, B:11:0x0030, B:13:0x0038, B:37:0x0095, B:38:0x00a2, B:40:0x00a8, B:41:0x00c4), top: B:54:0x0019 }] */
    /* JADX WARN: Type inference failed for: r8v11, types: [T, java.lang.String] */
    @Override // rn.b, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z10;
        androidx.fragment.app.p activity;
        BufferedReader bufferedReader;
        String[] fileList;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("ab1_animation", "");
        } else {
            str = null;
        }
        try {
            if (Build.VERSION.SDK_INT < 25) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.ab1Lottie);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRenderMode(a3.t.SOFTWARE);
                }
            } else {
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.ab1Lottie);
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setRenderMode(a3.t.HARDWARE);
                }
            }
            boolean z11 = false;
            if (str != null && str.length() != 0) {
                z10 = false;
                if (!z10 && getActivity() != null) {
                    activity = getActivity();
                    if (activity != null && (fileList = activity.fileList()) != null && is.k.Q1(str, fileList)) {
                        z11 = true;
                    }
                    if (z11) {
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        xVar.f23469u = "";
                        Context context = getContext();
                        kotlin.jvm.internal.i.d(context);
                        FileInputStream openFileInput = context.openFileInput(str);
                        kotlin.jvm.internal.i.f(openFileInput, "context!!.openFileInput(jsonFileName)");
                        InputStreamReader inputStreamReader = new InputStreamReader(openFileInput, gv.a.f16927b);
                        if (inputStreamReader instanceof BufferedReader) {
                            bufferedReader = (BufferedReader) inputStreamReader;
                        } else {
                            bufferedReader = new BufferedReader(inputStreamReader, 8192);
                        }
                        Iterator it = fv.k.v0(new rs.b(bufferedReader)).iterator();
                        while (it.hasNext()) {
                            xVar.f23469u = ((String) xVar.f23469u) + ((String) it.next());
                        }
                        hs.k kVar = hs.k.f19476a;
                        ca.a.z(bufferedReader, null);
                        a3.d.d((String) xVar.f23469u).b(new pl.i(this, xVar, 1));
                    }
                }
                F().U();
            }
            z10 = true;
            if (!z10) {
                activity = getActivity();
                if (activity != null) {
                    z11 = true;
                }
                if (z11) {
                }
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26416w, e10);
        }
    }
}
