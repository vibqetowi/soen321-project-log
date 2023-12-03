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
/* compiled from: CB1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/g0;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g0 extends rn.b {
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f26490w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26491x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f26492y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public String f26493z = "";
    public final String A = LogHelper.INSTANCE.makeLogTag(g0.class);

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:54:0x007b, B:55:0x007d, B:57:0x0085, B:63:0x0091), top: B:68:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047 A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:54:0x007b, B:55:0x007d, B:57:0x0085, B:63:0x0091), top: B:68:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051 A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:54:0x007b, B:55:0x007d, B:57:0x0085, B:63:0x0091), top: B:68:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0061 A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:54:0x007b, B:55:0x007d, B:57:0x0085, B:63:0x0091), top: B:68:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006b A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:54:0x007b, B:55:0x007d, B:57:0x0085, B:63:0x0091), top: B:68:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007b A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:54:0x007b, B:55:0x007d, B:57:0x0085, B:63:0x0091), top: B:68:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0085 A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:54:0x007b, B:55:0x007d, B:57:0x0085, B:63:0x0091), top: B:68:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0091 A[Catch: Exception -> 0x00a5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:42:0x0061, B:43:0x0063, B:45:0x006b, B:54:0x007b, B:55:0x007d, B:57:0x0085, B:63:0x0091), top: B:68:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
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
        ArrayList<String> stringArrayList3;
        boolean z13;
        String string;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string2 = arguments.getString("cb1_intro_text", "");
                boolean z14 = false;
                if (string2 != null && string2.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.cb1Title)).setText(string2);
                    }
                    stringArrayList = arguments.getStringArrayList("cb1_title_list");
                    if (stringArrayList != null && !stringArrayList.isEmpty()) {
                        z11 = false;
                        if (!z11) {
                            stringArrayList = null;
                        }
                        if (stringArrayList != null) {
                            this.f26491x = stringArrayList;
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb1_icon_list");
                        if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                            z12 = false;
                            if (!z12) {
                                stringArrayList2 = null;
                            }
                            if (stringArrayList2 != null) {
                                this.f26490w = stringArrayList2;
                            }
                            stringArrayList3 = arguments.getStringArrayList("cb1_desc_list");
                            if (stringArrayList3 != null && !stringArrayList3.isEmpty()) {
                                z13 = false;
                                if (!z13) {
                                    stringArrayList3 = null;
                                }
                                if (stringArrayList3 != null) {
                                    this.f26492y = stringArrayList3;
                                }
                                string = arguments.getString("template_colour", "");
                                if (!((string != null || string.length() == 0) ? true : true)) {
                                    str = string;
                                }
                                if (str == null) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.cb1Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                    this.f26493z = str;
                                    return;
                                }
                                return;
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (stringArrayList3 != null) {
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
                        stringArrayList3 = arguments.getStringArrayList("cb1_desc_list");
                        if (stringArrayList3 != null) {
                            z13 = false;
                            if (!z13) {
                            }
                            if (stringArrayList3 != null) {
                            }
                            string = arguments.getString("template_colour", "");
                            if (!((string != null || string.length() == 0) ? true : true)) {
                            }
                            if (str == null) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (stringArrayList3 != null) {
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
                    stringArrayList2 = arguments.getStringArrayList("cb1_icon_list");
                    if (stringArrayList2 != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        stringArrayList3 = arguments.getStringArrayList("cb1_desc_list");
                        if (stringArrayList3 != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (stringArrayList3 != null) {
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
                    stringArrayList3 = arguments.getStringArrayList("cb1_desc_list");
                    if (stringArrayList3 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (stringArrayList3 != null) {
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
                stringArrayList = arguments.getStringArrayList("cb1_title_list");
                if (stringArrayList != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb1_icon_list");
                    if (stringArrayList2 != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    stringArrayList3 = arguments.getStringArrayList("cb1_desc_list");
                    if (stringArrayList3 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (stringArrayList3 != null) {
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
                stringArrayList2 = arguments.getStringArrayList("cb1_icon_list");
                if (stringArrayList2 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (stringArrayList2 != null) {
                }
                stringArrayList3 = arguments.getStringArrayList("cb1_desc_list");
                if (stringArrayList3 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (stringArrayList3 != null) {
                }
                string = arguments.getString("template_colour", "");
                if (!((string != null || string.length() == 0) ? true : true)) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.B.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
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
        return inflater.inflate(R.layout.fragment_cb1, viewGroup, false);
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
            Integer num = (Integer) is.k.c2(new Integer[]{Integer.valueOf(this.f26490w.size()), Integer.valueOf(this.f26491x.size()), Integer.valueOf(this.f26492y.size())});
            if (num != null) {
                i6 = num.intValue();
            } else {
                i6 = 0;
            }
            for (int i10 = 0; i10 < i6; i10++) {
                View inflate = getLayoutInflater().inflate(R.layout.row_cb1, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.cb1Container)), false);
                String str = (String) is.u.j2(i10, this.f26490w);
                String str2 = null;
                if (str != null) {
                    if (getActivity() == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        str = null;
                    }
                    if (str != null) {
                        androidx.fragment.app.p activity = getActivity();
                        kotlin.jvm.internal.i.d(activity);
                        com.bumptech.glide.f d10 = Glide.c(activity).d(activity);
                        androidx.fragment.app.p activity2 = getActivity();
                        kotlin.jvm.internal.i.d(activity2);
                        d10.d(new File(activity2.getFilesDir(), str)).B((AppCompatImageView) inflate.findViewById(R.id.cb1RowImage));
                    }
                }
                String str3 = (String) is.u.j2(i10, this.f26491x);
                if (str3 != null) {
                    ((RobertoTextView) inflate.findViewById(R.id.cb1RowTitle)).setText(str3);
                }
                String str4 = (String) is.u.j2(i10, this.f26492y);
                if (str4 != null) {
                    ((RobertoTextView) inflate.findViewById(R.id.cb1RowSubtitle)).setText(str4);
                }
                String str5 = this.f26493z;
                if (!gv.n.B0(str5)) {
                    str2 = str5;
                }
                ((RobertoTextView) inflate.findViewById(R.id.cb1RowTitle)).setTextColor(ColorStateList.valueOf(Color.parseColor(str2)));
                ((RobertoTextView) inflate.findViewById(R.id.cb1RowSubtitle)).setTextColor(ColorStateList.valueOf(Color.parseColor(str2)));
                ((LinearLayout) _$_findCachedViewById(R.id.cb1Container)).addView(inflate);
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }
}
