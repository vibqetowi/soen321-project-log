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
/* compiled from: CB14Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/a0;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a0 extends rn.b {

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f26420y = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f26418w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final String f26419x = LogHelper.INSTANCE.makeLogTag(a0.class);

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:52:0x0081), top: B:57:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:52:0x0081), top: B:57:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:52:0x0081), top: B:57:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:52:0x0081), top: B:57:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:52:0x0081), top: B:57:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0081 A[Catch: Exception -> 0x00a4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:52:0x0081), top: B:57:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
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
        String string2;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string3 = arguments.getString("cb14_title", "");
                boolean z13 = false;
                if (string3 != null && string3.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.cb14Title)).setText(string3);
                    }
                    string = arguments.getString("cb14_desc", "");
                    if (string != null && string.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            string = null;
                        }
                        if (string != null) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.cb14Subtitle)).setText(string);
                        }
                        stringArrayList = arguments.getStringArrayList("cb14_icon_list");
                        if (stringArrayList != null && !stringArrayList.isEmpty()) {
                            z12 = false;
                            if (!z12) {
                                stringArrayList = null;
                            }
                            if (stringArrayList != null) {
                                this.f26418w = stringArrayList;
                            }
                            string2 = arguments.getString("template_colour", "");
                            if (!((string2 != null || string2.length() == 0) ? true : true)) {
                                str = string2;
                            }
                            if (str == null) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.cb14Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                ((RobertoTextView) _$_findCachedViewById(R.id.cb14Subtitle)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                return;
                            }
                            return;
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        if (stringArrayList != null) {
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
                    stringArrayList = arguments.getStringArrayList("cb14_icon_list");
                    if (stringArrayList != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (stringArrayList != null) {
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
                string = arguments.getString("cb14_desc", "");
                if (string != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    stringArrayList = arguments.getStringArrayList("cb14_icon_list");
                    if (stringArrayList != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList != null) {
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
                stringArrayList = arguments.getStringArrayList("cb14_icon_list");
                if (stringArrayList != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (stringArrayList != null) {
                }
                string2 = arguments.getString("template_colour", "");
                if (!((string2 != null || string2.length() == 0) ? true : true)) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26419x, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.f26420y.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26420y;
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
        return inflater.inflate(R.layout.fragment_cb14, viewGroup, false);
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            I();
            int size = this.f26418w.size();
            for (int i6 = 0; i6 < size; i6++) {
                View inflate = getLayoutInflater().inflate(R.layout.row_cb3, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.cb14Container)), false);
                String str = (String) is.u.j2(i6, this.f26418w);
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
                        d10.d(new File(activity2.getFilesDir(), str)).B((AppCompatImageView) inflate.findViewById(R.id.cb3RowImage));
                    }
                }
                ((LinearLayout) _$_findCachedViewById(R.id.cb14Container)).addView(inflate);
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26419x, e10);
        }
    }
}
