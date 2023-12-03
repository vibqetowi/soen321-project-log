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
/* compiled from: CB17Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/d0;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d0 extends rn.b {
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f26464w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26465x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f26466y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public final String f26467z = LogHelper.INSTANCE.makeLogTag(d0.class);

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0035, B:29:0x0045, B:30:0x0047, B:32:0x004f, B:41:0x005f, B:42:0x0061, B:44:0x0069, B:53:0x0079, B:54:0x007b, B:56:0x0085, B:62:0x0091), top: B:67:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0035, B:29:0x0045, B:30:0x0047, B:32:0x004f, B:41:0x005f, B:42:0x0061, B:44:0x0069, B:53:0x0079, B:54:0x007b, B:56:0x0085, B:62:0x0091), top: B:67:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0035, B:29:0x0045, B:30:0x0047, B:32:0x004f, B:41:0x005f, B:42:0x0061, B:44:0x0069, B:53:0x0079, B:54:0x007b, B:56:0x0085, B:62:0x0091), top: B:67:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005f A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0035, B:29:0x0045, B:30:0x0047, B:32:0x004f, B:41:0x005f, B:42:0x0061, B:44:0x0069, B:53:0x0079, B:54:0x007b, B:56:0x0085, B:62:0x0091), top: B:67:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0035, B:29:0x0045, B:30:0x0047, B:32:0x004f, B:41:0x005f, B:42:0x0061, B:44:0x0069, B:53:0x0079, B:54:0x007b, B:56:0x0085, B:62:0x0091), top: B:67:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0079 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0035, B:29:0x0045, B:30:0x0047, B:32:0x004f, B:41:0x005f, B:42:0x0061, B:44:0x0069, B:53:0x0079, B:54:0x007b, B:56:0x0085, B:62:0x0091), top: B:67:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0085 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0035, B:29:0x0045, B:30:0x0047, B:32:0x004f, B:41:0x005f, B:42:0x0061, B:44:0x0069, B:53:0x0079, B:54:0x007b, B:56:0x0085, B:62:0x0091), top: B:67:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0091 A[Catch: Exception -> 0x00a3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a3, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0035, B:29:0x0045, B:30:0x0047, B:32:0x004f, B:41:0x005f, B:42:0x0061, B:44:0x0069, B:53:0x0079, B:54:0x007b, B:56:0x0085, B:62:0x0091), top: B:67:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
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
                String string2 = arguments.getString("cb17_title");
                boolean z14 = false;
                if (string2 != null && string2.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.cb16Title)).setText(string2);
                    }
                    stringArrayList = arguments.getStringArrayList("cb17_icon_list");
                    if (stringArrayList != null && !stringArrayList.isEmpty()) {
                        z11 = false;
                        if (!z11) {
                            stringArrayList = null;
                        }
                        if (stringArrayList != null) {
                            this.f26464w = stringArrayList;
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb17_icon_title_list");
                        if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                            z12 = false;
                            if (!z12) {
                                stringArrayList2 = null;
                            }
                            if (stringArrayList2 != null) {
                                this.f26465x = stringArrayList2;
                            }
                            stringArrayList3 = arguments.getStringArrayList("cb17_icon_desc_list");
                            if (stringArrayList3 != null && !stringArrayList3.isEmpty()) {
                                z13 = false;
                                if (!z13) {
                                    stringArrayList3 = null;
                                }
                                if (stringArrayList3 != null) {
                                    this.f26466y = stringArrayList3;
                                }
                                string = arguments.getString("template_colour", "");
                                if (!((string != null || string.length() == 0) ? true : true)) {
                                    str = string;
                                }
                                if (str == null) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.cb16Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
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
                        stringArrayList3 = arguments.getStringArrayList("cb17_icon_desc_list");
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
                    stringArrayList2 = arguments.getStringArrayList("cb17_icon_title_list");
                    if (stringArrayList2 != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        stringArrayList3 = arguments.getStringArrayList("cb17_icon_desc_list");
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
                    stringArrayList3 = arguments.getStringArrayList("cb17_icon_desc_list");
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
                stringArrayList = arguments.getStringArrayList("cb17_icon_list");
                if (stringArrayList != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb17_icon_title_list");
                    if (stringArrayList2 != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    stringArrayList3 = arguments.getStringArrayList("cb17_icon_desc_list");
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
                stringArrayList2 = arguments.getStringArrayList("cb17_icon_title_list");
                if (stringArrayList2 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (stringArrayList2 != null) {
                }
                stringArrayList3 = arguments.getStringArrayList("cb17_icon_desc_list");
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
            LogHelper.INSTANCE.e(this.f26467z, e10);
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
            Integer num = (Integer) is.k.c2(new Integer[]{Integer.valueOf(this.f26464w.size()), Integer.valueOf(this.f26465x.size()), Integer.valueOf(this.f26466y.size())});
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
                    String str2 = (String) is.u.j2(i10, this.f26464w);
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
                    String str3 = (String) is.u.j2(i10, this.f26465x);
                    if (str3 != null) {
                        ((RobertoTextView) inflate.findViewById(R.id.row1Cb16Title)).setText(str3);
                    }
                    String str4 = (String) is.u.j2(i10, this.f26466y);
                    if (str4 != null) {
                        ((RobertoTextView) inflate.findViewById(R.id.row1Cb16Subtitle)).setText(str4);
                    }
                    ((LinearLayout) _$_findCachedViewById(R.id.cb16Container)).addView(inflate);
                } else {
                    View inflate2 = getLayoutInflater().inflate(R.layout.row_cb16_2, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.cb16Container)), false);
                    String str5 = (String) is.u.j2(i10, this.f26464w);
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
                    String str6 = (String) is.u.j2(i10, this.f26465x);
                    if (str6 != null) {
                        ((RobertoTextView) inflate2.findViewById(R.id.row2Cb16Title)).setText(str6);
                    }
                    String str7 = (String) is.u.j2(i10, this.f26466y);
                    if (str7 != null) {
                        ((RobertoTextView) inflate2.findViewById(R.id.row2Cb16Subtitle)).setText(str7);
                    }
                    ((LinearLayout) _$_findCachedViewById(R.id.cb16Container)).addView(inflate2);
                }
                z12 = !z12;
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26467z, e10);
        }
    }
}
