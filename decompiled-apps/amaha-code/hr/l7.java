package hr;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.appsflyer.R;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.CompassionLetterStorageModel;
import com.theinnerhour.b2b.model.ScreenResult11Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS33Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/l7;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l7 extends rr.b {
    public static final /* synthetic */ int H = 0;
    public hs.f<String, ScreenResult11Model> A;
    public ProgressDialog C;
    public Uri D;
    public Uri E;
    public TemplateActivity F;

    /* renamed from: v  reason: collision with root package name */
    public File f18752v;

    /* renamed from: z  reason: collision with root package name */
    public boolean f18756z;
    public final LinkedHashMap G = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18751u = LogHelper.INSTANCE.makeLogTag(l7.class);

    /* renamed from: w  reason: collision with root package name */
    public final int f18753w = 1241;

    /* renamed from: x  reason: collision with root package name */
    public final String[] f18754x = {"android.permission.CAMERA"};

    /* renamed from: y  reason: collision with root package name */
    public final int f18755y = R.styleable.AppCompatTheme_textColorSearchUrl;
    public final androidx.lifecycle.m0 B = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new d(this), new e(this), new f(this));

    /* compiled from: ScreenS33Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ fm.a f18757u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18758v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str) {
            super(1);
            this.f18757u = aVar;
            this.f18758v = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            boolean z10;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null && ((Boolean) fVar2.f19464u).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f18757u.o(this.f18758v, true);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS33Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18760v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f18760v = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar) {
            HashMap hashMap;
            hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar2 = fVar;
            l7 l7Var = l7.this;
            String F0 = gv.n.F0(String.valueOf(l7Var.D), "https:", "");
            if (fVar2 != null) {
                hashMap = (HashMap) fVar2.f19465v;
            } else {
                hashMap = null;
            }
            ScreenResult11Model gratitudeLetterMapToObject = UtilFunKt.gratitudeLetterMapToObject(hashMap);
            ArrayList<CompassionLetterStorageModel> gratitude_files = gratitudeLetterMapToObject.getGratitude_files();
            Utils utils = Utils.INSTANCE;
            long timeInSeconds = utils.getTimeInSeconds();
            Uri uri = l7Var.E;
            if (uri != null) {
                String lastPathSegment = uri.getLastPathSegment();
                kotlin.jvm.internal.i.d(lastPathSegment);
                gratitude_files.add(new CompassionLetterStorageModel(timeInSeconds, lastPathSegment, F0));
                ProgressDialog progressDialog = l7Var.C;
                if (progressDialog != null && progressDialog.isShowing()) {
                    ProgressDialog progressDialog2 = l7Var.C;
                    if (progressDialog2 != null) {
                        progressDialog2.dismiss();
                    } else {
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                }
                l7Var.A = new hs.f<>(this.f18760v, gratitudeLetterMapToObject);
                l7Var.f18756z = true;
                RobertoButton robertoButton = (RobertoButton) l7Var._$_findCachedViewById(com.theinnerhour.b2b.R.id.btnS33ButtonOne);
                if (robertoButton != null) {
                    robertoButton.setText(l7Var.getString(com.theinnerhour.b2b.R.string.next));
                }
                utils.showCustomToast(l7Var.getActivity(), "Uploaded Successfully");
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("file");
            throw null;
        }
    }

    /* compiled from: ScreenS33Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool != null) {
                l7 l7Var = l7.this;
                ProgressDialog progressDialog = l7Var.C;
                if (progressDialog != null && progressDialog.isShowing()) {
                    ProgressDialog progressDialog2 = l7Var.C;
                    if (progressDialog2 != null) {
                        progressDialog2.dismiss();
                    } else {
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                }
                androidx.fragment.app.p activity = l7Var.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity).Q) {
                    androidx.fragment.app.p activity2 = l7Var.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity2).n0();
                } else {
                    androidx.fragment.app.p activity3 = l7Var.getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity3).t0();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18762u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18762u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18762u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18763u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18763u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18763u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18764u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f18764u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18764u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final void J() {
        try {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
                this.f18752v = null;
                File file = new File(requireActivity().getFilesDir(), "images");
                if (!file.exists()) {
                    file.mkdirs();
                }
                String format = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
                this.f18752v = new File(file, "compassion_letter_" + format + ".jpg");
                androidx.fragment.app.p requireActivity = requireActivity();
                File file2 = this.f18752v;
                kotlin.jvm.internal.i.d(file2);
                Uri b10 = FileProvider.b(requireActivity, "com.theinnerhour.b2b.provider", file2);
                requireActivity().grantUriPermission("com.theinnerhour.b2b", b10, 2);
                intent.setFlags(2);
                intent.putExtra("output", b10);
                startActivityForResult(intent, this.f18753w);
                return;
            }
            Utils utils = Utils.INSTANCE;
            androidx.fragment.app.p requireActivity2 = requireActivity();
            String string = getString(com.theinnerhour.b2b.R.string.no_image_uploaded);
            kotlin.jvm.internal.i.f(string, "getString(R.string.no_image_uploaded)");
            utils.showCustomToast(requireActivity2, string);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18751u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.G;
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
    public final void onActivityResult(int i6, int i10, Intent intent) {
        LogHelper logHelper = LogHelper.INSTANCE;
        Object[] objArr = {defpackage.b.j("onactivity result req code ", i6, " resultcode ", i10)};
        String str = this.f18751u;
        logHelper.i(str, objArr);
        if (i10 == -1) {
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, e10);
            }
            if (i6 == this.f18753w) {
                if (this.f18752v == null) {
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p requireActivity = requireActivity();
                    String string = getString(com.theinnerhour.b2b.R.string.telecommunicationsError);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.telecommunicationsError)");
                    utils.showCustomToast(requireActivity, string);
                    return;
                }
                com.bumptech.glide.f i11 = Glide.i(requireActivity());
                File file = this.f18752v;
                kotlin.jvm.internal.i.d(file);
                i11.d(file).B((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.imageView2));
                ((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.imageView2)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivShare)).setVisibility(0);
                ((RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnS33ButtonOne)).setText("Upload");
                ((RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnS33ButtonTwo)).setVisibility(8);
                h2.o.a((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.constraintRoot), null);
                super.onActivityResult(i6, i10, intent);
            }
        }
        Utils utils2 = Utils.INSTANCE;
        androidx.fragment.app.p requireActivity2 = requireActivity();
        String string2 = getString(com.theinnerhour.b2b.R.string.no_image_uploaded);
        kotlin.jvm.internal.i.f(string2, "getString(R.string.no_image_uploaded)");
        utils2.showCustomToast(requireActivity2, string2);
        this.f18752v = null;
        super.onActivityResult(i6, i10, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(com.theinnerhour.b2b.R.layout.fragment_screen_s33, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.B.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.G.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i6, String[] permissions, int[] grantResults) {
        boolean z10;
        kotlin.jvm.internal.i.g(permissions, "permissions");
        kotlin.jvm.internal.i.g(grantResults, "grantResults");
        if (i6 == this.f18755y) {
            if (grantResults.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !z10;
            String str = this.f18751u;
            if (z11 && grantResults[0] == 0) {
                LogHelper.INSTANCE.i(str, "permission granted");
                J();
            } else {
                LogHelper.INSTANCE.i(str, "permission denied");
                Utils.INSTANCE.showCustomToast(requireActivity(), "Permission is needed to take picture");
            }
        }
        super.onRequestPermissionsResult(i6, permissions, grantResults);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            this.F = templateActivity;
            if (templateActivity.W) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                TemplateModel templateModel = ((TemplateActivity) activity2).f10547y;
                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                    fm.a aVar = (fm.a) this.B.getValue();
                    aVar.f15178l0.e(getViewLifecycleOwner(), new r3(21, new a(aVar, label)));
                    aVar.f15181o0.e(getViewLifecycleOwner(), new r3(22, new b(label)));
                    aVar.f15174h0.e(getViewLifecycleOwner(), new r3(23, new c()));
                }
            }
            ((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivHelp)).setVisibility(0);
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity3).A0();
            androidx.fragment.app.p activity4 = getActivity();
            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity2 = (TemplateActivity) activity4;
            ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.tvS33Question)).setText(UtilFunKt.paramsMapToString(A0.get("s33_question")));
            ((RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnS33ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s33_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnS33ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s33_btn_two_text")));
            ((RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnS33ButtonOne)).setOnClickListener(new sq.p(this, 24, templateActivity2));
            if (this.f18752v != null) {
                com.bumptech.glide.f i6 = Glide.i(requireActivity());
                File file = this.f18752v;
                kotlin.jvm.internal.i.d(file);
                i6.d(file).B((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.imageView2));
                ((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.imageView2)).setVisibility(0);
                ((RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnS33ButtonOne)).setText("Upload");
                ((RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnS33ButtonTwo)).setVisibility(8);
                h2.o.a((ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.constraintRoot), null);
                ((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivShare)).setVisibility(0);
            }
            ((RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnS33ButtonTwo)).setOnClickListener(new i4(templateActivity2, 23));
            ((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.k7

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ l7 f18691v;

                {
                    this.f18691v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    l7 this$0 = this.f18691v;
                    switch (i10) {
                        case 0:
                            int i11 = l7.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(com.theinnerhour.b2b.R.id.ivEllipses));
                            a1Var.a().inflate(com.theinnerhour.b2b.R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(4, this$0);
                            a1Var.b();
                            return;
                        default:
                            int i12 = l7.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.f18752v != null) {
                                Context requireContext = this$0.requireContext();
                                File file2 = this$0.f18752v;
                                kotlin.jvm.internal.i.d(file2);
                                Uri b10 = FileProvider.b(requireContext, "com.theinnerhour.b2b.provider", file2);
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setFlags(268435456);
                                intent.addFlags(1);
                                intent.putExtra("android.intent.extra.STREAM", b10);
                                intent.setType("image/jpg");
                                this$0.startActivity(Intent.createChooser(intent, "Share using"));
                                return;
                            }
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivHelp)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivHelp)).setOnClickListener(new i4(templateActivity2, 24));
            ((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivClose)).setOnClickListener(new i4(templateActivity2, 25));
            ((ImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivShare)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.k7

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ l7 f18691v;

                {
                    this.f18691v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    l7 this$0 = this.f18691v;
                    switch (i10) {
                        case 0:
                            int i11 = l7.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(com.theinnerhour.b2b.R.id.ivEllipses));
                            a1Var.a().inflate(com.theinnerhour.b2b.R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(4, this$0);
                            a1Var.b();
                            return;
                        default:
                            int i12 = l7.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.f18752v != null) {
                                Context requireContext = this$0.requireContext();
                                File file2 = this$0.f18752v;
                                kotlin.jvm.internal.i.d(file2);
                                Uri b10 = FileProvider.b(requireContext, "com.theinnerhour.b2b.provider", file2);
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setFlags(268435456);
                                intent.addFlags(1);
                                intent.putExtra("android.intent.extra.STREAM", b10);
                                intent.setType("image/jpg");
                                this$0.startActivity(Intent.createChooser(intent, "Share using"));
                                return;
                            }
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18751u, "exception in on view created", e10);
        }
    }
}
