package nn;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: CB12Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/y;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class y extends rn.b {
    public static final /* synthetic */ int B = 0;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f26654w = LogHelper.INSTANCE.makeLogTag(y.class);

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26655x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f26656y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<String> f26657z = new ArrayList<>();

    /* compiled from: CB12Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f26659b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f26660c;

        public a(int i6, ObjectAnimator objectAnimator) {
            this.f26659b = i6;
            this.f26660c = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            y yVar = y.this;
            String str = (String) is.u.j2(this.f26659b, yVar.f26656y);
            if (str != null) {
                ((RobertoTextView) yVar._$_findCachedViewById(R.id.cb12Footer1)).setText(str);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) yVar._$_findCachedViewById(R.id.cb12Footer1), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(350L);
            ofFloat.start();
            this.f26660c.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    /* compiled from: CB12Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f26662b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f26663c;

        public b(int i6, ObjectAnimator objectAnimator) {
            this.f26662b = i6;
            this.f26663c = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            y yVar = y.this;
            String str = (String) is.u.j2(this.f26662b, yVar.f26657z);
            if (str != null) {
                ((RobertoTextView) yVar._$_findCachedViewById(R.id.cb12Footer2)).setText(str);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) yVar._$_findCachedViewById(R.id.cb12Footer2), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(350L);
            ofFloat.start();
            this.f26663c.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    public final void I(int i6) {
        try {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.cb12Footer1), "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(350L);
            ofFloat.addListener(new a(i6, ofFloat));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.cb12Footer2), "alpha", 1.0f, 0.0f);
            ofFloat2.setDuration(350L);
            ofFloat2.addListener(new b(i6, ofFloat));
            ofFloat.start();
            ofFloat2.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26654w, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0157, code lost:
        r6 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0143 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014d A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015a A[Catch: Exception -> 0x01b0, TRY_LEAVE, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006e A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008f A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0103 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0116 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0133 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:44:0x006e, B:45:0x0077, B:47:0x007f, B:56:0x008f, B:57:0x00cb, B:59:0x00d3, B:69:0x00e6, B:73:0x00f8, B:74:0x00fb, B:76:0x0103, B:86:0x0116, B:90:0x0128, B:91:0x012b, B:93:0x0133, B:102:0x0143, B:103:0x0145, B:105:0x014d, B:112:0x015a), top: B:117:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        boolean z10;
        String str;
        String string;
        boolean z11;
        String string2;
        boolean z12;
        String string3;
        boolean z13;
        ArrayList<String> stringArrayList;
        boolean z14;
        ArrayList<String> stringArrayList2;
        boolean z15;
        ArrayList<String> stringArrayList3;
        boolean z16;
        String string4;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string5 = arguments.getString("cb12_title", "");
                boolean z17 = true;
                if (string5 != null && string5.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string5 = null;
                    }
                    if (string5 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.cb12Title)).setText(string5);
                    }
                    string = arguments.getString("cb12_subtitle_1", "");
                    if (string != null && string.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            string = null;
                        }
                        if (string != null) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.cb12Subtitle1)).setText(string);
                        }
                        string2 = arguments.getString("cb12_subtitle_2", "");
                        if (string2 != null && string2.length() != 0) {
                            z12 = false;
                            if (!z12) {
                                string2 = null;
                            }
                            if (string2 != null) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.cb12Subtitle2)).setText(string2);
                            }
                            string3 = arguments.getString("cb12_pointer_color", "");
                            if (string3 != null && string3.length() != 0) {
                                z13 = false;
                                if (!z13) {
                                    string3 = null;
                                }
                                if (string3 != null) {
                                    ((AppCompatImageView) _$_findCachedViewById(R.id.cb12Arrow1)).setImageTintList(ColorStateList.valueOf(Color.parseColor(string3)));
                                    ((AppCompatImageView) _$_findCachedViewById(R.id.cb12Arrow2)).setImageTintList(ColorStateList.valueOf(Color.parseColor(string3)));
                                    ((AppCompatImageView) _$_findCachedViewById(R.id.cb12Arrow3)).setImageTintList(ColorStateList.valueOf(Color.parseColor(string3)));
                                }
                                stringArrayList = arguments.getStringArrayList("cb12_icon_title_list");
                                if (stringArrayList != null && !stringArrayList.isEmpty()) {
                                    z14 = false;
                                    if (!z14) {
                                        stringArrayList = null;
                                    }
                                    if (stringArrayList != null) {
                                        this.f26656y = stringArrayList;
                                        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.cb12Footer1);
                                        String str2 = (String) is.u.j2(0, stringArrayList);
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        robertoTextView.setText(str2);
                                    }
                                    stringArrayList2 = arguments.getStringArrayList("cb12_icon_desc_list");
                                    if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                                        z15 = false;
                                        if (!z15) {
                                            stringArrayList2 = null;
                                        }
                                        if (stringArrayList2 != null) {
                                            this.f26657z = stringArrayList2;
                                            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.cb12Footer2);
                                            String str3 = (String) is.u.j2(0, stringArrayList2);
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            robertoTextView2.setText(str3);
                                        }
                                        stringArrayList3 = arguments.getStringArrayList("cb12_icon_list");
                                        if (stringArrayList3 != null && !stringArrayList3.isEmpty()) {
                                            z16 = false;
                                            if (!z16) {
                                                stringArrayList3 = null;
                                            }
                                            if (stringArrayList3 != null) {
                                                this.f26655x = stringArrayList3;
                                            }
                                            string4 = arguments.getString("template_colour", "");
                                            if (string4 != null && string4.length() != 0) {
                                                z17 = false;
                                            }
                                            if (str == null) {
                                                ((RobertoTextView) _$_findCachedViewById(R.id.cb12Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                                ((RobertoTextView) _$_findCachedViewById(R.id.cb12Subtitle1)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                                ((RobertoTextView) _$_findCachedViewById(R.id.cb12Subtitle2)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                                ((RobertoTextView) _$_findCachedViewById(R.id.cb12Footer1)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                                ((RobertoTextView) _$_findCachedViewById(R.id.cb12Footer2)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                                return;
                                            }
                                            return;
                                        }
                                        z16 = true;
                                        if (!z16) {
                                        }
                                        if (stringArrayList3 != null) {
                                        }
                                        string4 = arguments.getString("template_colour", "");
                                        if (string4 != null) {
                                            z17 = false;
                                        }
                                        if (str == null) {
                                        }
                                    }
                                    z15 = true;
                                    if (!z15) {
                                    }
                                    if (stringArrayList2 != null) {
                                    }
                                    stringArrayList3 = arguments.getStringArrayList("cb12_icon_list");
                                    if (stringArrayList3 != null) {
                                        z16 = false;
                                        if (!z16) {
                                        }
                                        if (stringArrayList3 != null) {
                                        }
                                        string4 = arguments.getString("template_colour", "");
                                        if (string4 != null) {
                                        }
                                        if (str == null) {
                                        }
                                    }
                                    z16 = true;
                                    if (!z16) {
                                    }
                                    if (stringArrayList3 != null) {
                                    }
                                    string4 = arguments.getString("template_colour", "");
                                    if (string4 != null) {
                                    }
                                    if (str == null) {
                                    }
                                }
                                z14 = true;
                                if (!z14) {
                                }
                                if (stringArrayList != null) {
                                }
                                stringArrayList2 = arguments.getStringArrayList("cb12_icon_desc_list");
                                if (stringArrayList2 != null) {
                                    z15 = false;
                                    if (!z15) {
                                    }
                                    if (stringArrayList2 != null) {
                                    }
                                    stringArrayList3 = arguments.getStringArrayList("cb12_icon_list");
                                    if (stringArrayList3 != null) {
                                    }
                                    z16 = true;
                                    if (!z16) {
                                    }
                                    if (stringArrayList3 != null) {
                                    }
                                    string4 = arguments.getString("template_colour", "");
                                    if (string4 != null) {
                                    }
                                    if (str == null) {
                                    }
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (stringArrayList2 != null) {
                                }
                                stringArrayList3 = arguments.getStringArrayList("cb12_icon_list");
                                if (stringArrayList3 != null) {
                                }
                                z16 = true;
                                if (!z16) {
                                }
                                if (stringArrayList3 != null) {
                                }
                                string4 = arguments.getString("template_colour", "");
                                if (string4 != null) {
                                }
                                if (str == null) {
                                }
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (string3 != null) {
                            }
                            stringArrayList = arguments.getStringArrayList("cb12_icon_title_list");
                            if (stringArrayList != null) {
                                z14 = false;
                                if (!z14) {
                                }
                                if (stringArrayList != null) {
                                }
                                stringArrayList2 = arguments.getStringArrayList("cb12_icon_desc_list");
                                if (stringArrayList2 != null) {
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (stringArrayList2 != null) {
                                }
                                stringArrayList3 = arguments.getStringArrayList("cb12_icon_list");
                                if (stringArrayList3 != null) {
                                }
                                z16 = true;
                                if (!z16) {
                                }
                                if (stringArrayList3 != null) {
                                }
                                string4 = arguments.getString("template_colour", "");
                                if (string4 != null) {
                                }
                                if (str == null) {
                                }
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (stringArrayList != null) {
                            }
                            stringArrayList2 = arguments.getStringArrayList("cb12_icon_desc_list");
                            if (stringArrayList2 != null) {
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            if (stringArrayList2 != null) {
                            }
                            stringArrayList3 = arguments.getStringArrayList("cb12_icon_list");
                            if (stringArrayList3 != null) {
                            }
                            z16 = true;
                            if (!z16) {
                            }
                            if (stringArrayList3 != null) {
                            }
                            string4 = arguments.getString("template_colour", "");
                            if (string4 != null) {
                            }
                            if (str == null) {
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        if (string2 != null) {
                        }
                        string3 = arguments.getString("cb12_pointer_color", "");
                        if (string3 != null) {
                            z13 = false;
                            if (!z13) {
                            }
                            if (string3 != null) {
                            }
                            stringArrayList = arguments.getStringArrayList("cb12_icon_title_list");
                            if (stringArrayList != null) {
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (stringArrayList != null) {
                            }
                            stringArrayList2 = arguments.getStringArrayList("cb12_icon_desc_list");
                            if (stringArrayList2 != null) {
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            if (stringArrayList2 != null) {
                            }
                            stringArrayList3 = arguments.getStringArrayList("cb12_icon_list");
                            if (stringArrayList3 != null) {
                            }
                            z16 = true;
                            if (!z16) {
                            }
                            if (stringArrayList3 != null) {
                            }
                            string4 = arguments.getString("template_colour", "");
                            if (string4 != null) {
                            }
                            if (str == null) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (string3 != null) {
                        }
                        stringArrayList = arguments.getStringArrayList("cb12_icon_title_list");
                        if (stringArrayList != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (stringArrayList != null) {
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb12_icon_desc_list");
                        if (stringArrayList2 != null) {
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        stringArrayList3 = arguments.getStringArrayList("cb12_icon_list");
                        if (stringArrayList3 != null) {
                        }
                        z16 = true;
                        if (!z16) {
                        }
                        if (stringArrayList3 != null) {
                        }
                        string4 = arguments.getString("template_colour", "");
                        if (string4 != null) {
                        }
                        if (str == null) {
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    string2 = arguments.getString("cb12_subtitle_2", "");
                    if (string2 != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (string2 != null) {
                        }
                        string3 = arguments.getString("cb12_pointer_color", "");
                        if (string3 != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (string3 != null) {
                        }
                        stringArrayList = arguments.getStringArrayList("cb12_icon_title_list");
                        if (stringArrayList != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (stringArrayList != null) {
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb12_icon_desc_list");
                        if (stringArrayList2 != null) {
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        stringArrayList3 = arguments.getStringArrayList("cb12_icon_list");
                        if (stringArrayList3 != null) {
                        }
                        z16 = true;
                        if (!z16) {
                        }
                        if (stringArrayList3 != null) {
                        }
                        string4 = arguments.getString("template_colour", "");
                        if (string4 != null) {
                        }
                        if (str == null) {
                        }
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (string2 != null) {
                    }
                    string3 = arguments.getString("cb12_pointer_color", "");
                    if (string3 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (string3 != null) {
                    }
                    stringArrayList = arguments.getStringArrayList("cb12_icon_title_list");
                    if (stringArrayList != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb12_icon_desc_list");
                    if (stringArrayList2 != null) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    stringArrayList3 = arguments.getStringArrayList("cb12_icon_list");
                    if (stringArrayList3 != null) {
                    }
                    z16 = true;
                    if (!z16) {
                    }
                    if (stringArrayList3 != null) {
                    }
                    string4 = arguments.getString("template_colour", "");
                    if (string4 != null) {
                    }
                    if (str == null) {
                    }
                }
                z10 = true;
                str = null;
                if (!z10) {
                }
                if (string5 != null) {
                }
                string = arguments.getString("cb12_subtitle_1", "");
                if (string != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    string2 = arguments.getString("cb12_subtitle_2", "");
                    if (string2 != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (string2 != null) {
                    }
                    string3 = arguments.getString("cb12_pointer_color", "");
                    if (string3 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (string3 != null) {
                    }
                    stringArrayList = arguments.getStringArrayList("cb12_icon_title_list");
                    if (stringArrayList != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb12_icon_desc_list");
                    if (stringArrayList2 != null) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    stringArrayList3 = arguments.getStringArrayList("cb12_icon_list");
                    if (stringArrayList3 != null) {
                    }
                    z16 = true;
                    if (!z16) {
                    }
                    if (stringArrayList3 != null) {
                    }
                    string4 = arguments.getString("template_colour", "");
                    if (string4 != null) {
                    }
                    if (str == null) {
                    }
                }
                z11 = true;
                if (!z11) {
                }
                if (string != null) {
                }
                string2 = arguments.getString("cb12_subtitle_2", "");
                if (string2 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (string2 != null) {
                }
                string3 = arguments.getString("cb12_pointer_color", "");
                if (string3 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (string3 != null) {
                }
                stringArrayList = arguments.getStringArrayList("cb12_icon_title_list");
                if (stringArrayList != null) {
                }
                z14 = true;
                if (!z14) {
                }
                if (stringArrayList != null) {
                }
                stringArrayList2 = arguments.getStringArrayList("cb12_icon_desc_list");
                if (stringArrayList2 != null) {
                }
                z15 = true;
                if (!z15) {
                }
                if (stringArrayList2 != null) {
                }
                stringArrayList3 = arguments.getStringArrayList("cb12_icon_list");
                if (stringArrayList3 != null) {
                }
                z16 = true;
                if (!z16) {
                }
                if (stringArrayList3 != null) {
                }
                string4 = arguments.getString("template_colour", "");
                if (string4 != null) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26654w, e10);
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
        return inflater.inflate(R.layout.fragment_cb12, viewGroup, false);
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
            ((AppCompatImageView) _$_findCachedViewById(R.id.cb12Image1)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f26650v;

                {
                    this.f26650v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    y this$0 = this.f26650v;
                    switch (i6) {
                        case 0:
                            int i10 = y.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow1)).setVisibility(0);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow2)).setVisibility(8);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow3)).setVisibility(8);
                            this$0.I(0);
                            return;
                        case 1:
                            int i11 = y.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow1)).setVisibility(8);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow2)).setVisibility(0);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow3)).setVisibility(8);
                            this$0.I(1);
                            return;
                        default:
                            int i12 = y.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow1)).setVisibility(8);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow2)).setVisibility(8);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow3)).setVisibility(0);
                            this$0.I(2);
                            return;
                    }
                }
            });
            ((AppCompatImageView) _$_findCachedViewById(R.id.cb12Image2)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f26650v;

                {
                    this.f26650v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    y this$0 = this.f26650v;
                    switch (i6) {
                        case 0:
                            int i10 = y.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow1)).setVisibility(0);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow2)).setVisibility(8);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow3)).setVisibility(8);
                            this$0.I(0);
                            return;
                        case 1:
                            int i11 = y.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow1)).setVisibility(8);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow2)).setVisibility(0);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow3)).setVisibility(8);
                            this$0.I(1);
                            return;
                        default:
                            int i12 = y.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow1)).setVisibility(8);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow2)).setVisibility(8);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow3)).setVisibility(0);
                            this$0.I(2);
                            return;
                    }
                }
            });
            ((AppCompatImageView) _$_findCachedViewById(R.id.cb12Image3)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f26650v;

                {
                    this.f26650v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    y this$0 = this.f26650v;
                    switch (i6) {
                        case 0:
                            int i10 = y.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow1)).setVisibility(0);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow2)).setVisibility(8);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow3)).setVisibility(8);
                            this$0.I(0);
                            return;
                        case 1:
                            int i11 = y.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow1)).setVisibility(8);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow2)).setVisibility(0);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow3)).setVisibility(8);
                            this$0.I(1);
                            return;
                        default:
                            int i12 = y.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow1)).setVisibility(8);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow2)).setVisibility(8);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.cb12Arrow3)).setVisibility(0);
                            this$0.I(2);
                            return;
                    }
                }
            });
            if (getActivity() != null) {
                String str = (String) is.u.j2(0, this.f26655x);
                if (str != null) {
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    com.bumptech.glide.f d10 = Glide.c(activity).d(activity);
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    d10.d(new File(activity2.getFilesDir(), str)).B((AppCompatImageView) _$_findCachedViewById(R.id.cb12Image1));
                }
                String str2 = (String) is.u.j2(1, this.f26655x);
                if (str2 != null) {
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.d(activity3);
                    com.bumptech.glide.f d11 = Glide.c(activity3).d(activity3);
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.d(activity4);
                    d11.d(new File(activity4.getFilesDir(), str2)).B((AppCompatImageView) _$_findCachedViewById(R.id.cb12Image2));
                }
                String str3 = (String) is.u.j2(2, this.f26655x);
                if (str3 != null) {
                    androidx.fragment.app.p activity5 = getActivity();
                    kotlin.jvm.internal.i.d(activity5);
                    com.bumptech.glide.f d12 = Glide.c(activity5).d(activity5);
                    androidx.fragment.app.p activity6 = getActivity();
                    kotlin.jvm.internal.i.d(activity6);
                    d12.d(new File(activity6.getFilesDir(), str3)).B((AppCompatImageView) _$_findCachedViewById(R.id.cb12Image3));
                }
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26654w, e10);
        }
    }
}
