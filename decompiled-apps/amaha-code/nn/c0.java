package nn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: CB16Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/c0;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c0 extends rn.b {
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f26449w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26450x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f26451y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public final String f26452z = LogHelper.INSTANCE.makeLogTag(c0.class);

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:3:0x0003, B:7:0x0011, B:9:0x0017, B:11:0x0021, B:21:0x0032, B:22:0x0034, B:24:0x003c, B:33:0x004c, B:34:0x004e, B:36:0x0056, B:42:0x0062, B:6:0x000c), top: B:47:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:3:0x0003, B:7:0x0011, B:9:0x0017, B:11:0x0021, B:21:0x0032, B:22:0x0034, B:24:0x003c, B:33:0x004c, B:34:0x004e, B:36:0x0056, B:42:0x0062, B:6:0x000c), top: B:47:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:3:0x0003, B:7:0x0011, B:9:0x0017, B:11:0x0021, B:21:0x0032, B:22:0x0034, B:24:0x003c, B:33:0x004c, B:34:0x004e, B:36:0x0056, B:42:0x0062, B:6:0x000c), top: B:47:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0062 A[Catch: Exception -> 0x0065, TRY_LEAVE, TryCatch #0 {Exception -> 0x0065, blocks: (B:3:0x0003, B:7:0x0011, B:9:0x0017, B:11:0x0021, B:21:0x0032, B:22:0x0034, B:24:0x003c, B:33:0x004c, B:34:0x004e, B:36:0x0056, B:42:0x0062, B:6:0x000c), top: B:47:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z10;
        ArrayList<String> arrayList;
        ArrayList<String> stringArrayList;
        boolean z11;
        ArrayList<String> stringArrayList2;
        try {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.cb16Title);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(8);
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                ArrayList<String> stringArrayList3 = arguments.getStringArrayList("cb16_icon_list");
                boolean z12 = false;
                if (stringArrayList3 != null && !stringArrayList3.isEmpty()) {
                    z10 = false;
                    arrayList = null;
                    if (!z10) {
                        stringArrayList3 = null;
                    }
                    if (stringArrayList3 != null) {
                        this.f26449w = stringArrayList3;
                    }
                    stringArrayList = arguments.getStringArrayList("cb16_icon_title_list");
                    if (stringArrayList != null && !stringArrayList.isEmpty()) {
                        z11 = false;
                        if (!z11) {
                            stringArrayList = null;
                        }
                        if (stringArrayList != null) {
                            this.f26450x = stringArrayList;
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb16_icon_desc_list");
                        if (!((stringArrayList2 != null || stringArrayList2.isEmpty()) ? true : true)) {
                            arrayList = stringArrayList2;
                        }
                        if (arrayList == null) {
                            this.f26451y = arrayList;
                            return;
                        }
                        return;
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb16_icon_desc_list");
                    if (!((stringArrayList2 != null || stringArrayList2.isEmpty()) ? true : true)) {
                    }
                    if (arrayList == null) {
                    }
                }
                z10 = true;
                arrayList = null;
                if (!z10) {
                }
                if (stringArrayList3 != null) {
                }
                stringArrayList = arguments.getStringArrayList("cb16_icon_title_list");
                if (stringArrayList != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb16_icon_desc_list");
                    if (!((stringArrayList2 != null || stringArrayList2.isEmpty()) ? true : true)) {
                    }
                    if (arrayList == null) {
                    }
                }
                z11 = true;
                if (!z11) {
                }
                if (stringArrayList != null) {
                }
                stringArrayList2 = arguments.getStringArrayList("cb16_icon_desc_list");
                if (!((stringArrayList2 != null || stringArrayList2.isEmpty()) ? true : true)) {
                }
                if (arrayList == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26452z, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.A.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.A;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_cb16, viewGroup, false);
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            I();
            Integer num = (Integer) is.k.c2(new Integer[]{Integer.valueOf(this.f26449w.size()), Integer.valueOf(this.f26450x.size()), Integer.valueOf(this.f26451y.size())});
            if (num != null) {
                i6 = num.intValue();
            } else {
                i6 = 0;
            }
            boolean z12 = true;
            for (int i10 = 0; i10 < i6; i10++) {
                String str = null;
                if (z12) {
                    View inflate = getLayoutInflater().inflate(R.layout.row_cb16_1, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.cb16Container)), false);
                    String str2 = (String) is.u.j2(i10, this.f26449w);
                    if (str2 != null) {
                        if (getActivity() == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            str = str2;
                        }
                        if (str != null) {
                            androidx.fragment.app.p activity = getActivity();
                            kotlin.jvm.internal.i.d(activity);
                            com.bumptech.glide.f d10 = Glide.c(activity).d(activity);
                            androidx.fragment.app.p activity2 = getActivity();
                            kotlin.jvm.internal.i.d(activity2);
                            d10.d(new File(activity2.getFilesDir(), str)).B((AppCompatImageView) inflate.findViewById(R.id.row1Cb16Image));
                        }
                    }
                    String str3 = (String) is.u.j2(i10, this.f26450x);
                    if (str3 != null) {
                        ((RobertoTextView) inflate.findViewById(R.id.row1Cb16Title)).setText(str3);
                    }
                    String str4 = (String) is.u.j2(i10, this.f26451y);
                    if (str4 != null) {
                        ((RobertoTextView) inflate.findViewById(R.id.row1Cb16Subtitle)).setText(str4);
                    }
                    ((LinearLayout) _$_findCachedViewById(R.id.cb16Container)).addView(inflate);
                } else {
                    View inflate2 = getLayoutInflater().inflate(R.layout.row_cb16_2, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.cb16Container)), false);
                    String str5 = (String) is.u.j2(i10, this.f26449w);
                    if (str5 != null) {
                        if (getActivity() == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            str = str5;
                        }
                        if (str != null) {
                            androidx.fragment.app.p activity3 = getActivity();
                            kotlin.jvm.internal.i.d(activity3);
                            com.bumptech.glide.f d11 = Glide.c(activity3).d(activity3);
                            androidx.fragment.app.p activity4 = getActivity();
                            kotlin.jvm.internal.i.d(activity4);
                            d11.d(new File(activity4.getFilesDir(), str)).B((AppCompatImageView) inflate2.findViewById(R.id.row2Cb16Image));
                        }
                    }
                    String str6 = (String) is.u.j2(i10, this.f26450x);
                    if (str6 != null) {
                        ((RobertoTextView) inflate2.findViewById(R.id.row2Cb16Title)).setText(str6);
                    }
                    String str7 = (String) is.u.j2(i10, this.f26451y);
                    if (str7 != null) {
                        ((RobertoTextView) inflate2.findViewById(R.id.row2Cb16Subtitle)).setText(str7);
                    }
                    ((LinearLayout) _$_findCachedViewById(R.id.cb16Container)).addView(inflate2);
                }
                z12 = !z12;
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26452z, e10);
        }
    }
}
