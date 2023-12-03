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
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: CB8Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/o0;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o0 extends rn.b {
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f26562w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26563x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public String f26564y = "";

    /* renamed from: z  reason: collision with root package name */
    public final String f26565z = LogHelper.INSTANCE.makeLogTag(o0.class);

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0085 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008f A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009b A[Catch: Exception -> 0x00c0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z10;
        String str;
        String string;
        boolean z11;
        ArrayList<String> stringArrayList;
        boolean z12;
        ArrayList<String> stringArrayList2;
        boolean z13;
        String string2;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string3 = arguments.getString("cb8_title", "");
                boolean z14 = false;
                if (string3 != null && string3.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.cb8Title)).setText(string3);
                    }
                    string = arguments.getString("cb8_end_text", "");
                    if (string != null && string.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            string = null;
                        }
                        if (string != null) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.cb8Footer)).setText(string);
                        }
                        stringArrayList = arguments.getStringArrayList("cb8_icon_list");
                        if (stringArrayList != null && !stringArrayList.isEmpty()) {
                            z12 = false;
                            if (!z12) {
                                stringArrayList = null;
                            }
                            if (stringArrayList != null) {
                                this.f26562w = stringArrayList;
                            }
                            stringArrayList2 = arguments.getStringArrayList("cb8_point_list");
                            if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                                z13 = false;
                                if (!z13) {
                                    stringArrayList2 = null;
                                }
                                if (stringArrayList2 != null) {
                                    this.f26563x = stringArrayList2;
                                }
                                string2 = arguments.getString("template_colour", "");
                                if (!((string2 != null || string2.length() == 0) ? true : true)) {
                                    str = string2;
                                }
                                if (str == null) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.cb8Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                    ((RobertoTextView) _$_findCachedViewById(R.id.cb8Footer)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                    this.f26564y = str;
                                    return;
                                }
                                return;
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (stringArrayList2 != null) {
                            }
                            string2 = arguments.getString("template_colour", "");
                            if (!((string2 != null || string2.length() == 0) ? true : true)) {
                            }
                            if (str == null) {
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        if (stringArrayList != null) {
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb8_point_list");
                        if (stringArrayList2 != null) {
                            z13 = false;
                            if (!z13) {
                            }
                            if (stringArrayList2 != null) {
                            }
                            string2 = arguments.getString("template_colour", "");
                            if (!((string2 != null || string2.length() == 0) ? true : true)) {
                            }
                            if (str == null) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        string2 = arguments.getString("template_colour", "");
                        if (!((string2 != null || string2.length() == 0) ? true : true)) {
                        }
                        if (str == null) {
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    stringArrayList = arguments.getStringArrayList("cb8_icon_list");
                    if (stringArrayList != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (stringArrayList != null) {
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb8_point_list");
                        if (stringArrayList2 != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        string2 = arguments.getString("template_colour", "");
                        if (!((string2 != null || string2.length() == 0) ? true : true)) {
                        }
                        if (str == null) {
                        }
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb8_point_list");
                    if (stringArrayList2 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    string2 = arguments.getString("template_colour", "");
                    if (!((string2 != null || string2.length() == 0) ? true : true)) {
                    }
                    if (str == null) {
                    }
                }
                z10 = true;
                str = null;
                if (!z10) {
                }
                if (string3 != null) {
                }
                string = arguments.getString("cb8_end_text", "");
                if (string != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    stringArrayList = arguments.getStringArrayList("cb8_icon_list");
                    if (stringArrayList != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb8_point_list");
                    if (stringArrayList2 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    string2 = arguments.getString("template_colour", "");
                    if (!((string2 != null || string2.length() == 0) ? true : true)) {
                    }
                    if (str == null) {
                    }
                }
                z11 = true;
                if (!z11) {
                }
                if (string != null) {
                }
                stringArrayList = arguments.getStringArrayList("cb8_icon_list");
                if (stringArrayList != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (stringArrayList != null) {
                }
                stringArrayList2 = arguments.getStringArrayList("cb8_point_list");
                if (stringArrayList2 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (stringArrayList2 != null) {
                }
                string2 = arguments.getString("template_colour", "");
                if (!((string2 != null || string2.length() == 0) ? true : true)) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26565z, e10);
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
        return inflater.inflate(R.layout.fragment_cb8, viewGroup, false);
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object next;
        int i6;
        boolean z10;
        RobertoTextView robertoTextView;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            I();
            Iterator<T> it = this.f26563x.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int length = ((String) next).length();
                    do {
                        Object next2 = it.next();
                        int length2 = ((String) next2).length();
                        if (length < length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it.hasNext());
                }
            }
            String str = (String) next;
            if (str != null && (robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.cb8WidthGeneratorText)) != null) {
                robertoTextView.setText(str);
            }
            Integer num = (Integer) is.k.c2(new Integer[]{Integer.valueOf(this.f26562w.size()), Integer.valueOf(this.f26563x.size())});
            if (num != null) {
                i6 = num.intValue();
            } else {
                i6 = 0;
            }
            for (int i10 = 0; i10 < i6; i10++) {
                View inflate = getLayoutInflater().inflate(R.layout.row_cb8, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.cb8Container)), false);
                if (!this.f26562w.isEmpty()) {
                    String str2 = (String) is.u.j2(i10, this.f26562w);
                    if (str2 == null) {
                        String str3 = this.f26562w.get(0);
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
                        d10.d(new File(activity2.getFilesDir(), str2)).B((AppCompatImageView) inflate.findViewById(R.id.cb8RowImage));
                        androidx.fragment.app.p activity3 = getActivity();
                        kotlin.jvm.internal.i.d(activity3);
                        com.bumptech.glide.f d11 = Glide.c(activity3).d(activity3);
                        androidx.fragment.app.p activity4 = getActivity();
                        kotlin.jvm.internal.i.d(activity4);
                        d11.d(new File(activity4.getFilesDir(), str2)).B((AppCompatImageView) _$_findCachedViewById(R.id.cb8WidthGeneratorImage));
                    }
                }
                String str4 = (String) is.u.j2(i10, this.f26563x);
                if (str4 != null) {
                    ((RobertoTextView) inflate.findViewById(R.id.cb8RowText)).setText(str4);
                }
                String str5 = this.f26564y;
                if (gv.n.B0(str5)) {
                    str5 = null;
                }
                ((RobertoTextView) inflate.findViewById(R.id.cb8RowText)).setTextColor(ColorStateList.valueOf(Color.parseColor(str5)));
                ((LinearLayout) _$_findCachedViewById(R.id.cb8Container)).addView(inflate);
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26565z, e10);
        }
    }
}
