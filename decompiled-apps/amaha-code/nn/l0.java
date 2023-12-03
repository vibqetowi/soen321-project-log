package nn;

import android.content.res.ColorStateList;
import android.graphics.Color;
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
/* compiled from: CB5Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/l0;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l0 extends rn.b {
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f26537w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26538x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public String f26539y = "";

    /* renamed from: z  reason: collision with root package name */
    public final String f26540z = LogHelper.INSTANCE.makeLogTag(l0.class);

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:51:0x0077), top: B:56:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:51:0x0077), top: B:56:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:51:0x0077), top: B:56:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0061 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:51:0x0077), top: B:56:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006b A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:51:0x0077), top: B:56:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0077 A[Catch: Exception -> 0x008b, TRY_LEAVE, TryCatch #0 {Exception -> 0x008b, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:51:0x0077), top: B:56:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z10;
        String str;
        ArrayList<String> stringArrayList;
        boolean z11;
        ArrayList<String> stringArrayList2;
        boolean z12;
        String string;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string2 = arguments.getString("cb5_title", "");
                boolean z13 = false;
                if (string2 != null && string2.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.cb5Title)).setText(string2);
                    }
                    stringArrayList = arguments.getStringArrayList("cb5_icon_list");
                    if (stringArrayList != null && !stringArrayList.isEmpty()) {
                        z11 = false;
                        if (!z11) {
                            stringArrayList = null;
                        }
                        if (stringArrayList != null) {
                            this.f26537w = stringArrayList;
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb5_icon_desc_list");
                        if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                            z12 = false;
                            if (!z12) {
                                stringArrayList2 = null;
                            }
                            if (stringArrayList2 != null) {
                                this.f26538x = stringArrayList2;
                            }
                            string = arguments.getString("template_colour", "");
                            if (!((string != null || string.length() == 0) ? true : true)) {
                                str = string;
                            }
                            if (str == null) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.cb5Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                this.f26539y = str;
                                return;
                            }
                            return;
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        string = arguments.getString("template_colour", "");
                        if (!((string != null || string.length() == 0) ? true : true)) {
                        }
                        if (str == null) {
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb5_icon_desc_list");
                    if (stringArrayList2 != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        string = arguments.getString("template_colour", "");
                        if (!((string != null || string.length() == 0) ? true : true)) {
                        }
                        if (str == null) {
                        }
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    string = arguments.getString("template_colour", "");
                    if (!((string != null || string.length() == 0) ? true : true)) {
                    }
                    if (str == null) {
                    }
                }
                z10 = true;
                str = null;
                if (!z10) {
                }
                if (string2 != null) {
                }
                stringArrayList = arguments.getStringArrayList("cb5_icon_list");
                if (stringArrayList != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb5_icon_desc_list");
                    if (stringArrayList2 != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    string = arguments.getString("template_colour", "");
                    if (!((string != null || string.length() == 0) ? true : true)) {
                    }
                    if (str == null) {
                    }
                }
                z11 = true;
                if (!z11) {
                }
                if (stringArrayList != null) {
                }
                stringArrayList2 = arguments.getStringArrayList("cb5_icon_desc_list");
                if (stringArrayList2 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (stringArrayList2 != null) {
                }
                string = arguments.getString("template_colour", "");
                if (!((string != null || string.length() == 0) ? true : true)) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26540z, e10);
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
        return inflater.inflate(R.layout.fragment_cb5, viewGroup, false);
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
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            I();
            Integer num = (Integer) is.k.c2(new Integer[]{Integer.valueOf(this.f26537w.size()), Integer.valueOf(this.f26538x.size())});
            if (num != null) {
                i6 = num.intValue();
            } else {
                i6 = 0;
            }
            for (int i10 = 0; i10 < i6; i10++) {
                View inflate = getLayoutInflater().inflate(R.layout.row_cb5, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.cb5Container)), false);
                String str = null;
                if (!this.f26537w.isEmpty()) {
                    String str2 = (String) is.u.j2(i10, this.f26537w);
                    if (str2 == null) {
                        String str3 = this.f26537w.get(0);
                        kotlin.jvm.internal.i.f(str3, "illustrationNamesList[0]");
                        str2 = str3;
                    }
                    if (getActivity() == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        androidx.fragment.app.p activity = getActivity();
                        kotlin.jvm.internal.i.d(activity);
                        com.bumptech.glide.f d10 = Glide.c(activity).d(activity);
                        androidx.fragment.app.p activity2 = getActivity();
                        kotlin.jvm.internal.i.d(activity2);
                        d10.d(new File(activity2.getFilesDir(), str2)).B((AppCompatImageView) inflate.findViewById(R.id.cb5RowImage));
                    }
                }
                String str4 = (String) is.u.j2(i10, this.f26538x);
                if (str4 != null) {
                    ((RobertoTextView) inflate.findViewById(R.id.cb5RowText)).setText(str4);
                }
                String str5 = this.f26539y;
                if (!gv.n.B0(str5)) {
                    str = str5;
                }
                ((RobertoTextView) inflate.findViewById(R.id.cb5RowText)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                ((LinearLayout) _$_findCachedViewById(R.id.cb5Container)).addView(inflate);
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26540z, e10);
        }
    }
}
