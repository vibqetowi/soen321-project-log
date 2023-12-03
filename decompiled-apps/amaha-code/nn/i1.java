package nn;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: FB1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/i1;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i1 extends rn.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f26519y = 0;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f26521x = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f26520w = LogHelper.INSTANCE.makeLogTag(i1.class);

    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133 A[Catch: Exception -> 0x0156, TRY_LEAVE, TryCatch #0 {Exception -> 0x0156, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0014, B:12:0x001e, B:13:0x0027, B:15:0x0032, B:20:0x003c, B:21:0x0045, B:23:0x0050, B:28:0x005a, B:29:0x0063, B:31:0x006b, B:36:0x0075, B:37:0x0082, B:39:0x008d, B:44:0x0097, B:45:0x00a4, B:47:0x00ac, B:52:0x00b6, B:53:0x00c3, B:55:0x00ce, B:60:0x00d8, B:61:0x00e1, B:63:0x00e9, B:68:0x00f3, B:69:0x011a, B:71:0x0124, B:79:0x0133), top: B:84:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z10;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string = arguments.getString("fb1_concluding_line");
                String str = null;
                if (string != null) {
                    if (gv.n.B0(string)) {
                        string = null;
                    }
                    if (string != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.campaignHeading6)).setText(string);
                    }
                }
                String string2 = arguments.getString("fb1_auto_renew_desc");
                if (string2 != null) {
                    if (gv.n.B0(string2)) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.campaignDisclaimerText)).setText(string2);
                    }
                }
                String string3 = arguments.getString("fb1_feedback_title");
                if (string3 != null) {
                    if (gv.n.B0(string3)) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.campaignFeedbackText)).setText(string3);
                    }
                }
                String string4 = arguments.getString("fb1_feedback_color");
                if (string4 != null) {
                    if (gv.n.B0(string4)) {
                        string4 = null;
                    }
                    if (string4 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.campaignFeedbackText)).setTextColor(Color.parseColor(string4));
                    }
                }
                String string5 = arguments.getString("fb1_tnc_text");
                if (string5 != null) {
                    if (gv.n.B0(string5)) {
                        string5 = null;
                    }
                    if (string5 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.campaignTermsText)).setText(string5.concat(" | "));
                    }
                }
                String string6 = arguments.getString("fb1_tnc_color");
                if (string6 != null) {
                    if (gv.n.B0(string6)) {
                        string6 = null;
                    }
                    if (string6 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.campaignTermsText)).setTextColor(Color.parseColor(string6));
                    }
                }
                String string7 = arguments.getString("fb1_pp_text");
                if (string7 != null) {
                    if (gv.n.B0(string7)) {
                        string7 = null;
                    }
                    if (string7 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.campaignPolicyText)).setText(string7);
                    }
                }
                String string8 = arguments.getString("fb1_pp_color");
                if (string8 != null) {
                    if (gv.n.B0(string8)) {
                        string8 = null;
                    }
                    if (string8 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.campaignPolicyText)).setTextColor(Color.parseColor(string8));
                        ((RobertoTextView) _$_findCachedViewById(R.id.campaignPolicyText)).setTextColor(Color.parseColor(string8));
                        ((RobertoTextView) _$_findCachedViewById(R.id.campaignPolicyText)).setTextColor(Color.parseColor(string8));
                    }
                }
                String string9 = arguments.getString("template_colour", "");
                if (string9 != null && string9.length() != 0) {
                    z10 = false;
                    if (!z10) {
                        str = string9;
                    }
                    if (str == null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.campaignHeading6)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                        ((RobertoTextView) _$_findCachedViewById(R.id.campaignDisclaimerText)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                        return;
                    }
                    return;
                }
                z10 = true;
                if (!z10) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26520w, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.f26521x.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26521x;
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
        return inflater.inflate(R.layout.fragment_fb1, viewGroup, false);
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
            I();
            ((RobertoTextView) _$_findCachedViewById(R.id.campaignFeedbackText)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.h1

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ i1 f26511v;

                {
                    this.f26511v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    i1 this$0 = this.f26511v;
                    switch (i6) {
                        case 0:
                            int i10 = i1.f26519y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F().O();
                            return;
                        case 1:
                            int i11 = i1.f26519y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F().S();
                            return;
                        default:
                            int i12 = i1.f26519y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F().P();
                            return;
                    }
                }
            });
            ((RobertoTextView) _$_findCachedViewById(R.id.campaignTermsText)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.h1

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ i1 f26511v;

                {
                    this.f26511v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    i1 this$0 = this.f26511v;
                    switch (i6) {
                        case 0:
                            int i10 = i1.f26519y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F().O();
                            return;
                        case 1:
                            int i11 = i1.f26519y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F().S();
                            return;
                        default:
                            int i12 = i1.f26519y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F().P();
                            return;
                    }
                }
            });
            ((RobertoTextView) _$_findCachedViewById(R.id.campaignPolicyText)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.h1

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ i1 f26511v;

                {
                    this.f26511v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    i1 this$0 = this.f26511v;
                    switch (i6) {
                        case 0:
                            int i10 = i1.f26519y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F().O();
                            return;
                        case 1:
                            int i11 = i1.f26519y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F().S();
                            return;
                        default:
                            int i12 = i1.f26519y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F().P();
                            return;
                    }
                }
            });
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26520w, e10);
        }
    }
}
