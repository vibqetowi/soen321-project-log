package nn;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: FAQ1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/g1;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g1 extends rn.b {
    public static final /* synthetic */ int B = 0;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f26494w = LogHelper.INSTANCE.makeLogTag(g1.class);

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26495x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f26496y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public String f26497z = "";

    public final void I(ConstraintLayout constraintLayout) {
        try {
            if (((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).getVisibility() == 0) {
                ((AppCompatImageView) constraintLayout.findViewById(R.id.faqChevron)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
            } else {
                ((AppCompatImageView) constraintLayout.findViewById(R.id.faqChevron)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26494w, "exception", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012a A[Catch: Exception -> 0x0152, TryCatch #0 {Exception -> 0x0152, blocks: (B:3:0x0005, B:5:0x0020, B:7:0x002c, B:12:0x0036, B:13:0x003f, B:15:0x004a, B:20:0x0054, B:21:0x0061, B:23:0x0069, B:28:0x0073, B:29:0x007c, B:31:0x0084, B:36:0x008e, B:37:0x00a4, B:39:0x00ac, B:44:0x00b6, B:45:0x00bf, B:47:0x00c7, B:52:0x00d1, B:53:0x00de, B:55:0x00e8, B:63:0x00f7, B:64:0x00f9, B:66:0x0101, B:74:0x0110, B:75:0x0112, B:77:0x011a, B:86:0x012a, B:87:0x013b, B:89:0x0143, B:95:0x014f), top: B:100:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014f A[Catch: Exception -> 0x0152, TRY_LEAVE, TryCatch #0 {Exception -> 0x0152, blocks: (B:3:0x0005, B:5:0x0020, B:7:0x002c, B:12:0x0036, B:13:0x003f, B:15:0x004a, B:20:0x0054, B:21:0x0061, B:23:0x0069, B:28:0x0073, B:29:0x007c, B:31:0x0084, B:36:0x008e, B:37:0x00a4, B:39:0x00ac, B:44:0x00b6, B:45:0x00bf, B:47:0x00c7, B:52:0x00d1, B:53:0x00de, B:55:0x00e8, B:63:0x00f7, B:64:0x00f9, B:66:0x0101, B:74:0x0110, B:75:0x0112, B:77:0x011a, B:86:0x012a, B:87:0x013b, B:89:0x0143, B:95:0x014f), top: B:100:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        boolean z10;
        String string;
        boolean z11;
        boolean z12;
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.faq1PaymentCta)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.faq1PaymentCta)).getPaintFlags() | 8);
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string2 = arguments.getString("faq1_title");
                String str = null;
                if (string2 != null) {
                    if (gv.n.B0(string2)) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.faq1Header)).setText(string2);
                    }
                }
                String string3 = arguments.getString("faq1_text_color");
                if (string3 != null) {
                    if (gv.n.B0(string3)) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        ((RobertoButton) _$_findCachedViewById(R.id.faq1Cta)).setTextColor(Color.parseColor(string3));
                    }
                }
                String string4 = arguments.getString("faq1_cta");
                if (string4 != null) {
                    if (gv.n.B0(string4)) {
                        string4 = null;
                    }
                    if (string4 != null) {
                        ((RobertoButton) _$_findCachedViewById(R.id.faq1Cta)).setText(string4);
                    }
                }
                String string5 = arguments.getString("faq1_border_color");
                if (string5 != null) {
                    if (gv.n.B0(string5)) {
                        string5 = null;
                    }
                    if (string5 != null) {
                        ColorStateList valueOf = ColorStateList.valueOf(Color.parseColor(string5));
                        kotlin.jvm.internal.i.f(valueOf, "valueOf(Color.parseColor(it))");
                        ((RobertoButton) _$_findCachedViewById(R.id.faq1Cta)).setBackgroundTintList(valueOf);
                    }
                }
                String string6 = arguments.getString("faq1_payment_text");
                if (string6 != null) {
                    if (gv.n.B0(string6)) {
                        string6 = null;
                    }
                    if (string6 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.faq1PaymentCta)).setText(string6);
                    }
                }
                String string7 = arguments.getString("faq1_payment_text_color");
                if (string7 != null) {
                    if (gv.n.B0(string7)) {
                        string7 = null;
                    }
                    if (string7 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.faq1PaymentCta)).setTextColor(Color.parseColor(string7));
                    }
                }
                ArrayList<String> stringArrayList = arguments.getStringArrayList("faq1_questions_list");
                boolean z13 = false;
                if (stringArrayList != null) {
                    if (stringArrayList.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        stringArrayList = null;
                    }
                    if (stringArrayList != null) {
                        this.f26495x = stringArrayList;
                    }
                }
                ArrayList<String> stringArrayList2 = arguments.getStringArrayList("faq1_answers_list");
                if (stringArrayList2 != null) {
                    if (stringArrayList2.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        stringArrayList2 = null;
                    }
                    if (stringArrayList2 != null) {
                        this.f26496y = stringArrayList2;
                    }
                }
                String string8 = arguments.getString("template_colour", "");
                if (string8 != null && string8.length() != 0) {
                    z10 = false;
                    if (!z10) {
                        string8 = null;
                    }
                    if (string8 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.faq1Header)).setTextColor(ColorStateList.valueOf(Color.parseColor(string8)));
                    }
                    string = arguments.getString("screen", "");
                    if (!((string != null || string.length() == 0) ? true : true)) {
                        str = string;
                    }
                    if (str == null) {
                        this.f26497z = str;
                        return;
                    }
                    return;
                }
                z10 = true;
                if (!z10) {
                }
                if (string8 != null) {
                }
                string = arguments.getString("screen", "");
                if (!((string != null || string.length() == 0) ? true : true)) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26494w, e10);
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
        return inflater.inflate(R.layout.fragment_faq1, viewGroup, false);
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            J();
            ((RobertoButton) _$_findCachedViewById(R.id.faq1Cta)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.f1

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g1 f26485v;

                {
                    this.f26485v = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x010d A[Catch: Exception -> 0x01ab, TryCatch #1 {Exception -> 0x01ab, blocks: (B:6:0x0029, B:8:0x0046, B:9:0x0049, B:11:0x0064, B:14:0x0097, B:16:0x00b8, B:17:0x00dd, B:28:0x010d, B:33:0x0168, B:20:0x00f2, B:21:0x00f6, B:23:0x00fc, B:29:0x011e, B:31:0x012f, B:32:0x0156, B:34:0x0198), top: B:50:0x0029 }] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0168 A[SYNTHETIC] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6;
                    int i10 = r2;
                    g1 this$0 = this.f26485v;
                    switch (i10) {
                        case 0:
                            int i11 = g1.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                            ArrayList<String> arrayList = this$0.f26495x;
                            ArrayList<String> arrayList2 = this$0.f26496y;
                            String str = "faqAnswers[i]";
                            try {
                                Object systemService = requireActivity.getSystemService("layout_inflater");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                LayoutInflater layoutInflater = (LayoutInflater) systemService;
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_faq_fullscreen, requireActivity, R.style.Theme_Dialog_Fullscreen);
                                Window window = styledDialog.getWindow();
                                if (window != null) {
                                    window.setLayout(-1, -1);
                                }
                                ((AppCompatImageView) styledDialog.findViewById(R.id.dialogFAQBack)).setOnClickListener(new lm.f(styledDialog, 14));
                                int size = arrayList.size();
                                int i12 = 0;
                                int i13 = 0;
                                while (i13 < size) {
                                    View inflate = layoutInflater.inflate(R.layout.row_monetization_faq, (ViewGroup) null);
                                    kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    ((RobertoTextView) constraintLayout.findViewById(R.id.faqTitle)).setText(arrayList.get(i13));
                                    String str2 = arrayList2.get(i13);
                                    kotlin.jvm.internal.i.f(str2, str);
                                    if (gv.r.J0(str2, "</br>")) {
                                        String str3 = arrayList2.get(i13);
                                        kotlin.jvm.internal.i.f(str3, str);
                                        List<String> a12 = gv.r.a1(str3, new String[]{"</br>"}, i12, 6);
                                        String str4 = (String) is.u.g2(a12);
                                        boolean z10 = true;
                                        int i14 = 1;
                                        while (i14 < a12.size()) {
                                            str4 = str4 + System.getProperty("line.separator") + ((String) a12.get(i14));
                                            i14++;
                                            size = size;
                                        }
                                        i6 = size;
                                        ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setText(str4);
                                        if (!a12.isEmpty()) {
                                            for (String str5 : a12) {
                                                if (gv.r.J0(str5, "</a>")) {
                                                    if (!z10) {
                                                        ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setMovementMethod(LinkMovementMethod.getInstance());
                                                    }
                                                }
                                            }
                                        }
                                        z10 = false;
                                        if (!z10) {
                                        }
                                    } else {
                                        i6 = size;
                                        String str6 = arrayList2.get(i13);
                                        kotlin.jvm.internal.i.f(str6, str);
                                        if (gv.r.J0(str6, "</a>")) {
                                            ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setText(Html.fromHtml(arrayList2.get(i13)));
                                            ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setMovementMethod(LinkMovementMethod.getInstance());
                                        } else {
                                            ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setText(arrayList2.get(i13));
                                        }
                                    }
                                    constraintLayout.setOnClickListener(new el.c(constraintLayout, this$0, i13, arrayList, styledDialog, 3));
                                    ((LinearLayout) styledDialog.findViewById(R.id.dialogFAQLayout)).addView(constraintLayout);
                                    i13++;
                                    size = i6;
                                    layoutInflater = layoutInflater;
                                    str = str;
                                    i12 = 0;
                                }
                                styledDialog.show();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("screen", this$0.f26497z);
                                gk.a.b(bundle2, "monetization_faq_click");
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f26494w, e10);
                                return;
                            }
                        default:
                            int i15 = g1.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("screen", this$0.f26497z);
                                bundle3.putString("variant", "0");
                                gk.a.b(bundle3, "how_payment_works_click");
                                Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_payments_fullscreen, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                Window window2 = styledDialog2.getWindow();
                                if (window2 != null) {
                                    window2.setLayout(-1, -1);
                                }
                                ((RobertoTextView) styledDialog2.findViewById(R.id.tvPoint1Body)).setMovementMethod(LinkMovementMethod.getInstance());
                                ((RobertoTextView) styledDialog2.findViewById(R.id.tvPoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                                ((AppCompatImageView) styledDialog2.findViewById(R.id.dialogPaymentsBack)).setOnClickListener(new lm.f(styledDialog2, 13));
                                styledDialog2.show();
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f26494w, e11);
                                return;
                            }
                    }
                }
            });
            ((RobertoTextView) _$_findCachedViewById(R.id.faq1PaymentCta)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.f1

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g1 f26485v;

                {
                    this.f26485v = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x010d A[Catch: Exception -> 0x01ab, TryCatch #1 {Exception -> 0x01ab, blocks: (B:6:0x0029, B:8:0x0046, B:9:0x0049, B:11:0x0064, B:14:0x0097, B:16:0x00b8, B:17:0x00dd, B:28:0x010d, B:33:0x0168, B:20:0x00f2, B:21:0x00f6, B:23:0x00fc, B:29:0x011e, B:31:0x012f, B:32:0x0156, B:34:0x0198), top: B:50:0x0029 }] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0168 A[SYNTHETIC] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6;
                    int i10 = r2;
                    g1 this$0 = this.f26485v;
                    switch (i10) {
                        case 0:
                            int i11 = g1.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                            ArrayList<String> arrayList = this$0.f26495x;
                            ArrayList<String> arrayList2 = this$0.f26496y;
                            String str = "faqAnswers[i]";
                            try {
                                Object systemService = requireActivity.getSystemService("layout_inflater");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                LayoutInflater layoutInflater = (LayoutInflater) systemService;
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_faq_fullscreen, requireActivity, R.style.Theme_Dialog_Fullscreen);
                                Window window = styledDialog.getWindow();
                                if (window != null) {
                                    window.setLayout(-1, -1);
                                }
                                ((AppCompatImageView) styledDialog.findViewById(R.id.dialogFAQBack)).setOnClickListener(new lm.f(styledDialog, 14));
                                int size = arrayList.size();
                                int i12 = 0;
                                int i13 = 0;
                                while (i13 < size) {
                                    View inflate = layoutInflater.inflate(R.layout.row_monetization_faq, (ViewGroup) null);
                                    kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    ((RobertoTextView) constraintLayout.findViewById(R.id.faqTitle)).setText(arrayList.get(i13));
                                    String str2 = arrayList2.get(i13);
                                    kotlin.jvm.internal.i.f(str2, str);
                                    if (gv.r.J0(str2, "</br>")) {
                                        String str3 = arrayList2.get(i13);
                                        kotlin.jvm.internal.i.f(str3, str);
                                        List<String> a12 = gv.r.a1(str3, new String[]{"</br>"}, i12, 6);
                                        String str4 = (String) is.u.g2(a12);
                                        boolean z10 = true;
                                        int i14 = 1;
                                        while (i14 < a12.size()) {
                                            str4 = str4 + System.getProperty("line.separator") + ((String) a12.get(i14));
                                            i14++;
                                            size = size;
                                        }
                                        i6 = size;
                                        ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setText(str4);
                                        if (!a12.isEmpty()) {
                                            for (String str5 : a12) {
                                                if (gv.r.J0(str5, "</a>")) {
                                                    if (!z10) {
                                                        ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setMovementMethod(LinkMovementMethod.getInstance());
                                                    }
                                                }
                                            }
                                        }
                                        z10 = false;
                                        if (!z10) {
                                        }
                                    } else {
                                        i6 = size;
                                        String str6 = arrayList2.get(i13);
                                        kotlin.jvm.internal.i.f(str6, str);
                                        if (gv.r.J0(str6, "</a>")) {
                                            ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setText(Html.fromHtml(arrayList2.get(i13)));
                                            ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setMovementMethod(LinkMovementMethod.getInstance());
                                        } else {
                                            ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setText(arrayList2.get(i13));
                                        }
                                    }
                                    constraintLayout.setOnClickListener(new el.c(constraintLayout, this$0, i13, arrayList, styledDialog, 3));
                                    ((LinearLayout) styledDialog.findViewById(R.id.dialogFAQLayout)).addView(constraintLayout);
                                    i13++;
                                    size = i6;
                                    layoutInflater = layoutInflater;
                                    str = str;
                                    i12 = 0;
                                }
                                styledDialog.show();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("screen", this$0.f26497z);
                                gk.a.b(bundle2, "monetization_faq_click");
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f26494w, e10);
                                return;
                            }
                        default:
                            int i15 = g1.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("screen", this$0.f26497z);
                                bundle3.putString("variant", "0");
                                gk.a.b(bundle3, "how_payment_works_click");
                                Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_payments_fullscreen, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                Window window2 = styledDialog2.getWindow();
                                if (window2 != null) {
                                    window2.setLayout(-1, -1);
                                }
                                ((RobertoTextView) styledDialog2.findViewById(R.id.tvPoint1Body)).setMovementMethod(LinkMovementMethod.getInstance());
                                ((RobertoTextView) styledDialog2.findViewById(R.id.tvPoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                                ((AppCompatImageView) styledDialog2.findViewById(R.id.dialogPaymentsBack)).setOnClickListener(new lm.f(styledDialog2, 13));
                                styledDialog2.show();
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f26494w, e11);
                                return;
                            }
                    }
                }
            });
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26494w, e10);
        }
    }
}
