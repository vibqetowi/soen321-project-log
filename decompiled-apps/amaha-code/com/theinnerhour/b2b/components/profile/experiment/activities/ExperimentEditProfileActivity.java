package com.theinnerhour.b2b.components.profile.experiment.activities;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import androidx.lifecycle.x;
import com.bumptech.glide.Glide;
import com.bumptech.glide.e;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.hbb20.CountryCodePicker;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.components.profile.experiment.model.EditProfileModel;
import com.theinnerhour.b2b.components.profile.experiment.model.EditProfileStatus;
import com.theinnerhour.b2b.components.profile.experiment.model.ProfileAssetModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.CircleImageView;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import f5.f;
import gv.n;
import hs.i;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import so.g;
import so.m;
import so.o;
import so.p;
import so.q;
import so.r;
import so.s;
import wo.v;
/* compiled from: ExperimentEditProfileActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/profile/experiment/activities/ExperimentEditProfileActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ExperimentEditProfileActivity extends androidx.appcompat.app.c {
    public static final /* synthetic */ int P = 0;
    public BottomSheetBehavior<ConstraintLayout> A;
    public Uri B;
    public boolean D;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean K;
    public boolean L;

    /* renamed from: w  reason: collision with root package name */
    public v f11567w;

    /* renamed from: z  reason: collision with root package name */
    public Uri f11570z;
    public final LinkedHashMap O = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11566v = LogHelper.INSTANCE.makeLogTag("ExperimentEditProfileActivity");

    /* renamed from: x  reason: collision with root package name */
    public String f11568x = "";

    /* renamed from: y  reason: collision with root package name */
    public String f11569y = "";
    public String C = "";
    public final String[] E = {"android.permission.CAMERA"};
    public ArrayList<ProfileAssetModel.ProfileAvatarAsset> F = new ArrayList<>();
    public String J = "";
    public String M = "";
    public final i N = sp.b.O(new b());

    /* compiled from: ExperimentEditProfileActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11571a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f11572b;

        static {
            int[] iArr = new int[ApiNetworkStatus.values().length];
            try {
                iArr[ApiNetworkStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiNetworkStatus.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiNetworkStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiNetworkStatus.EXCEPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11571a = iArr;
            int[] iArr2 = new int[EditProfileStatus.values().length];
            try {
                iArr2[EditProfileStatus.UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EditProfileStatus.EMAIL_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f11572b = iArr2;
        }
    }

    /* compiled from: ExperimentEditProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<Dialog> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final Dialog invoke() {
            return UiUtils.Companion.getStyledDialog(R.layout.dialog_input_otp, ExperimentEditProfileActivity.this, R.style.Theme_Dialog);
        }
    }

    public static void n0(ExperimentEditProfileActivity this$0) {
        String str;
        String str2;
        String str3;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        if (!this$0.H) {
            String valueOf = String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileFirstName)).getText());
            v vVar = this$0.f11567w;
            String str4 = null;
            if (vVar != null) {
                EditProfileModel d10 = vVar.f36995z.d();
                if (d10 != null) {
                    str = d10.getFirstName();
                } else {
                    str = null;
                }
                if (kotlin.jvm.internal.i.b(valueOf, str)) {
                    String valueOf2 = String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileLastName)).getText());
                    v vVar2 = this$0.f11567w;
                    if (vVar2 != null) {
                        EditProfileModel d11 = vVar2.f36995z.d();
                        if (d11 != null) {
                            str2 = d11.getLastName();
                        } else {
                            str2 = null;
                        }
                        if (kotlin.jvm.internal.i.b(valueOf2, str2)) {
                            String valueOf3 = String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileEmail)).getText());
                            v vVar3 = this$0.f11567w;
                            if (vVar3 != null) {
                                EditProfileModel d12 = vVar3.f36995z.d();
                                if (d12 != null) {
                                    str3 = d12.getEmail();
                                } else {
                                    str3 = null;
                                }
                                if (kotlin.jvm.internal.i.b(valueOf3, str3)) {
                                    String valueOf4 = String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText());
                                    v vVar4 = this$0.f11567w;
                                    if (vVar4 != null) {
                                        EditProfileModel d13 = vVar4.f36995z.d();
                                        if (d13 != null) {
                                            str4 = d13.getMobile();
                                        }
                                        if (kotlin.jvm.internal.i.b(valueOf4, str4)) {
                                            super.onBackPressed();
                                            return;
                                        }
                                    } else {
                                        kotlin.jvm.internal.i.q("editProfileViewModel");
                                        throw null;
                                    }
                                }
                            } else {
                                kotlin.jvm.internal.i.q("editProfileViewModel");
                                throw null;
                            }
                        }
                    } else {
                        kotlin.jvm.internal.i.q("editProfileViewModel");
                        throw null;
                    }
                }
            } else {
                kotlin.jvm.internal.i.q("editProfileViewModel");
                throw null;
            }
        }
        this$0.v0();
    }

    public static final boolean p0(ExperimentEditProfileActivity experimentEditProfileActivity, Dialog dialog) {
        Editable editable;
        boolean z10;
        Editable editable2;
        boolean z11;
        Editable editable3;
        boolean z12;
        Editable editable4;
        boolean z13;
        RobertoEditText robertoEditText;
        RobertoEditText robertoEditText2;
        RobertoEditText robertoEditText3;
        RobertoEditText robertoEditText4;
        experimentEditProfileActivity.getClass();
        RobertoButton robertoButton = null;
        if (dialog != null && (robertoEditText4 = (RobertoEditText) dialog.findViewById(R.id.etOTPDialog1)) != null) {
            editable = robertoEditText4.getText();
        } else {
            editable = null;
        }
        if (editable != null && editable.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (dialog != null && (robertoEditText3 = (RobertoEditText) dialog.findViewById(R.id.etOTPDialog2)) != null) {
                editable2 = robertoEditText3.getText();
            } else {
                editable2 = null;
            }
            if (editable2 != null && editable2.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                if (dialog != null && (robertoEditText2 = (RobertoEditText) dialog.findViewById(R.id.etOTPDialog3)) != null) {
                    editable3 = robertoEditText2.getText();
                } else {
                    editable3 = null;
                }
                if (editable3 != null && editable3.length() != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    if (dialog != null && (robertoEditText = (RobertoEditText) dialog.findViewById(R.id.etOTPDialog4)) != null) {
                        editable4 = robertoEditText.getText();
                    } else {
                        editable4 = null;
                    }
                    if (editable4 != null && editable4.length() != 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (!z13) {
                        if (dialog != null) {
                            robertoButton = (RobertoButton) dialog.findViewById(R.id.btnOTPDialogCTA);
                        }
                        if (robertoButton == null) {
                            return true;
                        }
                        robertoButton.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(experimentEditProfileActivity, R.color.campaignLightBlue)));
                        return true;
                    }
                }
            }
        }
        if (dialog != null) {
            robertoButton = (RobertoButton) dialog.findViewById(R.id.btnOTPDialogCTA);
        }
        if (robertoButton != null) {
            robertoButton.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(experimentEditProfileActivity, R.color.campaignLightBlue40Opacity)));
        }
        return false;
    }

    @Override // android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        intent.putExtra("avatarAssetUploaded", this.I);
        setResult(-1, intent);
        super.finish();
    }

    public final View o0(int i6) {
        LinkedHashMap linkedHashMap = this.O;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        if (i10 == -1) {
            try {
                if (i6 == 113) {
                    if (intent != null) {
                        try {
                            Parcelable data = intent.getData();
                            f fVar = new f();
                            fVar.H = 1;
                            fVar.I = 1;
                            fVar.G = true;
                            fVar.f14825d0 = 500;
                            fVar.e0 = 500;
                            fVar.f14826f0 = 3;
                            fVar.a();
                            fVar.a();
                            Intent intent2 = new Intent();
                            intent2.setClass(this, CropImageActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("CROP_IMAGE_EXTRA_SOURCE", data);
                            bundle.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", fVar);
                            intent2.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle);
                            startActivityForResult(intent2, 203);
                            this.D = false;
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(e10);
                            return;
                        }
                    }
                    return;
                }
                d.a aVar = null;
                if (i6 == 112) {
                    try {
                        Parcelable parcelable = this.B;
                        if (parcelable != null) {
                            f fVar2 = new f();
                            fVar2.H = 1;
                            fVar2.I = 1;
                            fVar2.G = true;
                            fVar2.f14825d0 = 500;
                            fVar2.e0 = 500;
                            fVar2.f14826f0 = 3;
                            fVar2.a();
                            fVar2.a();
                            Intent intent3 = new Intent();
                            intent3.setClass(this, CropImageActivity.class);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("CROP_IMAGE_EXTRA_SOURCE", parcelable);
                            bundle2.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", fVar2);
                            intent3.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle2);
                            startActivityForResult(intent3, 203);
                            this.D = true;
                            return;
                        }
                        kotlin.jvm.internal.i.q("currentPhotoURI");
                        throw null;
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(e11);
                    }
                } else if (i6 == 203) {
                    if (intent != null) {
                        aVar = (d.a) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
                    }
                    if (i10 != -1) {
                        if (i10 == 204) {
                            kotlin.jvm.internal.i.d(aVar);
                            return;
                        }
                        return;
                    }
                    this.f11569y = "";
                    kotlin.jvm.internal.i.d(aVar);
                    this.f11570z = aVar.f6023v;
                    com.bumptech.glide.f d10 = Glide.c(this).d(this);
                    Uri uri = this.f11570z;
                    d10.getClass();
                    e eVar = new e(d10.f5956u, d10, Drawable.class, d10.f5957v);
                    eVar.Z = uri;
                    eVar.f5953b0 = true;
                    eVar.B((CircleImageView) o0(R.id.ivEditProfileImage));
                    this.H = true;
                    this.I = true;
                }
            } catch (Exception e12) {
                LogHelper.INSTANCE.e(this.f11566v, e12);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d2, code lost:
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0118, code lost:
        if (r0 != null) goto L94;
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBackPressed() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!this.H) {
            String valueOf = String.valueOf(((RobertoEditText) o0(R.id.etEditProfileFirstName)).getText());
            v vVar = this.f11567w;
            if (vVar != null) {
                EditProfileModel d10 = vVar.f36995z.d();
                if (d10 != null) {
                    str = d10.getFirstName();
                } else {
                    str = null;
                }
                if (!kotlin.jvm.internal.i.b(valueOf, str)) {
                    v vVar2 = this.f11567w;
                    if (vVar2 != null) {
                        EditProfileModel d11 = vVar2.f36995z.d();
                        if (d11 != null) {
                            str8 = d11.getFirstName();
                        } else {
                            str8 = null;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("editProfileViewModel");
                        throw null;
                    }
                }
                String valueOf2 = String.valueOf(((RobertoEditText) o0(R.id.etEditProfileLastName)).getText());
                v vVar3 = this.f11567w;
                if (vVar3 != null) {
                    EditProfileModel d12 = vVar3.f36995z.d();
                    if (d12 != null) {
                        str2 = d12.getLastName();
                    } else {
                        str2 = null;
                    }
                    if (!kotlin.jvm.internal.i.b(valueOf2, str2)) {
                        v vVar4 = this.f11567w;
                        if (vVar4 != null) {
                            EditProfileModel d13 = vVar4.f36995z.d();
                            if (d13 != null) {
                                str7 = d13.getLastName();
                            } else {
                                str7 = null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("editProfileViewModel");
                            throw null;
                        }
                    }
                    String valueOf3 = String.valueOf(((RobertoEditText) o0(R.id.etEditProfileEmail)).getText());
                    v vVar5 = this.f11567w;
                    if (vVar5 != null) {
                        EditProfileModel d14 = vVar5.f36995z.d();
                        if (d14 != null) {
                            str3 = d14.getEmail();
                        } else {
                            str3 = null;
                        }
                        if (!kotlin.jvm.internal.i.b(valueOf3, str3)) {
                            v vVar6 = this.f11567w;
                            if (vVar6 != null) {
                                EditProfileModel d15 = vVar6.f36995z.d();
                                if (d15 != null) {
                                    str6 = d15.getEmail();
                                } else {
                                    str6 = null;
                                }
                            } else {
                                kotlin.jvm.internal.i.q("editProfileViewModel");
                                throw null;
                            }
                        }
                        String valueOf4 = String.valueOf(((RobertoEditText) o0(R.id.etEditProfilePhone)).getText());
                        v vVar7 = this.f11567w;
                        if (vVar7 != null) {
                            EditProfileModel d16 = vVar7.f36995z.d();
                            if (d16 != null) {
                                str4 = d16.getMobile();
                            } else {
                                str4 = null;
                            }
                            if (!kotlin.jvm.internal.i.b(valueOf4, str4)) {
                                v vVar8 = this.f11567w;
                                if (vVar8 != null) {
                                    EditProfileModel d17 = vVar8.f36995z.d();
                                    if (d17 != null) {
                                        str5 = d17.getMobile();
                                    } else {
                                        str5 = null;
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q("editProfileViewModel");
                                    throw null;
                                }
                            }
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this.A;
                            if (bottomSheetBehavior != null) {
                                if (bottomSheetBehavior.getState() == 3) {
                                    BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this.A;
                                    if (bottomSheetBehavior2 != null) {
                                        bottomSheetBehavior2.setState(4);
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                        throw null;
                                    }
                                }
                                super.onBackPressed();
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("editProfileViewModel");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("editProfileViewModel");
                    throw null;
                }
                kotlin.jvm.internal.i.q("editProfileViewModel");
                throw null;
            }
            kotlin.jvm.internal.i.q("editProfileViewModel");
            throw null;
        }
        v0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:7|8|9|10|(1:12)|13|14|15|(2:17|18)(2:20|21)))|28|8|9|10|(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r0, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[Catch: Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:11:0x0040, B:13:0x004a, B:14:0x0053), top: B:27:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:18:0x0089, B:20:0x009a, B:21:0x0115, B:22:0x011b), top: B:26:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0115 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:18:0x0089, B:20:0x009a, B:21:0x0115, B:22:0x011b), top: B:26:0x0089 }] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        final v vVar;
        String str = this.f11566v;
        super.onCreate(bundle);
        setContentView(R.layout.activity_experiment_edit_profile);
        try {
            if (LocationPersistence.INSTANCE.isIndianUser()) {
                String stringValue = ApplicationPersistence.getInstance().getStringValue(Constants.LOGIN_SCREEN_EXPERIMENT);
                kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV….LOGIN_SCREEN_EXPERIMENT)");
                if ((!n.B0(stringValue)) && !kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.LOGIN_SCREEN_EXPERIMENT), "default")) {
                    z10 = true;
                    this.K = z10;
                    Window window = getWindow();
                    if (Build.VERSION.SDK_INT >= 23) {
                        window.getDecorView().setSystemUiVisibility(8192);
                    }
                    window.setStatusBarColor(-1);
                    this.G = true;
                    u0();
                    ((RobertoTextView) o0(R.id.tvEditProfileSave)).setPaintFlags(((RobertoTextView) o0(R.id.tvEditProfileSave)).getPaintFlags() | 8);
                    ((RobertoTextView) o0(R.id.tvEditProfileSave)).setOnClickListener(new g(this, 0));
                    vVar = (v) new o0(this).a(v.class);
                    this.f11567w = vVar;
                    if (vVar == null) {
                        vVar.f36995z.e(this, new ko.b(9, new m(this)));
                        vVar.A.e(this, new x(this) { // from class: so.h

                            /* renamed from: b  reason: collision with root package name */
                            public final /* synthetic */ ExperimentEditProfileActivity f31815b;

                            {
                                this.f31815b = this;
                            }

                            @Override // androidx.lifecycle.x
                            public final void a(Object obj) {
                                int i6 = r3;
                                int i10 = -1;
                                wo.v this_apply = vVar;
                                ExperimentEditProfileActivity this$0 = this.f31815b;
                                switch (i6) {
                                    case 0:
                                        ApiNetworkStatus apiNetworkStatus = (ApiNetworkStatus) obj;
                                        int i11 = ExperimentEditProfileActivity.P;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                        if (apiNetworkStatus != null) {
                                            try {
                                                i10 = ExperimentEditProfileActivity.a.f11571a[apiNetworkStatus.ordinal()];
                                            } catch (Exception e10) {
                                                LogHelper.INSTANCE.e(this_apply.f36994y, "Exception", e10);
                                                return;
                                            }
                                        }
                                        if (i10 != 1) {
                                            if (i10 != 2) {
                                                if (i10 != 3) {
                                                    if (i10 != 4) {
                                                        this$0.t0();
                                                        return;
                                                    }
                                                    Utils.INSTANCE.showCustomToast(this$0, "Something went wrong.. try later");
                                                    this$0.t0();
                                                    return;
                                                }
                                                this$0.t0();
                                                return;
                                            }
                                            ((ProgressBar) this$0.o0(R.id.pbEditProfile)).setVisibility(0);
                                            ((ScrollView) this$0.o0(R.id.svEditProfile)).setVisibility(8);
                                            return;
                                        }
                                        this$0.t0();
                                        return;
                                    default:
                                        EditProfileStatus editProfileStatus = (EditProfileStatus) obj;
                                        int i12 = ExperimentEditProfileActivity.P;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                        if (editProfileStatus != null) {
                                            try {
                                                i10 = ExperimentEditProfileActivity.a.f11572b[editProfileStatus.ordinal()];
                                            } catch (Exception e11) {
                                                LogHelper.INSTANCE.e(this_apply.f36994y, "exception", e11);
                                                return;
                                            }
                                        }
                                        if (i10 != 1) {
                                            if (i10 != 2) {
                                                Utils.INSTANCE.showCustomToast(this$0, "Error in updating profile");
                                                return;
                                            }
                                            Utils.INSTANCE.showCustomToast(this$0, "Done! You can now log in with your new credentials.");
                                            Intent addFlags = new Intent(this$0, LoginSignupReworkActivity.class).addFlags(268468224);
                                            kotlin.jvm.internal.i.f(addFlags, "intent.addFlags(Intent.F…t.FLAG_ACTIVITY_NEW_TASK)");
                                            this$0.startActivity(addFlags);
                                            this$0.finish();
                                            return;
                                        }
                                        Utils.INSTANCE.showCustomToast(this$0, "Profile updated successfully");
                                        return;
                                }
                            }
                        });
                        vVar.B.e(this, new x(this) { // from class: so.h

                            /* renamed from: b  reason: collision with root package name */
                            public final /* synthetic */ ExperimentEditProfileActivity f31815b;

                            {
                                this.f31815b = this;
                            }

                            @Override // androidx.lifecycle.x
                            public final void a(Object obj) {
                                int i6 = r3;
                                int i10 = -1;
                                wo.v this_apply = vVar;
                                ExperimentEditProfileActivity this$0 = this.f31815b;
                                switch (i6) {
                                    case 0:
                                        ApiNetworkStatus apiNetworkStatus = (ApiNetworkStatus) obj;
                                        int i11 = ExperimentEditProfileActivity.P;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                        if (apiNetworkStatus != null) {
                                            try {
                                                i10 = ExperimentEditProfileActivity.a.f11571a[apiNetworkStatus.ordinal()];
                                            } catch (Exception e10) {
                                                LogHelper.INSTANCE.e(this_apply.f36994y, "Exception", e10);
                                                return;
                                            }
                                        }
                                        if (i10 != 1) {
                                            if (i10 != 2) {
                                                if (i10 != 3) {
                                                    if (i10 != 4) {
                                                        this$0.t0();
                                                        return;
                                                    }
                                                    Utils.INSTANCE.showCustomToast(this$0, "Something went wrong.. try later");
                                                    this$0.t0();
                                                    return;
                                                }
                                                this$0.t0();
                                                return;
                                            }
                                            ((ProgressBar) this$0.o0(R.id.pbEditProfile)).setVisibility(0);
                                            ((ScrollView) this$0.o0(R.id.svEditProfile)).setVisibility(8);
                                            return;
                                        }
                                        this$0.t0();
                                        return;
                                    default:
                                        EditProfileStatus editProfileStatus = (EditProfileStatus) obj;
                                        int i12 = ExperimentEditProfileActivity.P;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                        if (editProfileStatus != null) {
                                            try {
                                                i10 = ExperimentEditProfileActivity.a.f11572b[editProfileStatus.ordinal()];
                                            } catch (Exception e11) {
                                                LogHelper.INSTANCE.e(this_apply.f36994y, "exception", e11);
                                                return;
                                            }
                                        }
                                        if (i10 != 1) {
                                            if (i10 != 2) {
                                                Utils.INSTANCE.showCustomToast(this$0, "Error in updating profile");
                                                return;
                                            }
                                            Utils.INSTANCE.showCustomToast(this$0, "Done! You can now log in with your new credentials.");
                                            Intent addFlags = new Intent(this$0, LoginSignupReworkActivity.class).addFlags(268468224);
                                            kotlin.jvm.internal.i.f(addFlags, "intent.addFlags(Intent.F…t.FLAG_ACTIVITY_NEW_TASK)");
                                            this$0.startActivity(addFlags);
                                            this$0.finish();
                                            return;
                                        }
                                        Utils.INSTANCE.showCustomToast(this$0, "Profile updated successfully");
                                        return;
                                }
                            }
                        });
                        vVar.C.e(this, new ko.b(10, new o(this)));
                        vVar.E.e(this, new ko.b(11, new p(this)));
                        vVar.F.e(this, new ko.b(12, new q(this)));
                        vVar.I.e(this, new ko.b(13, new r(this)));
                        vVar.K.e(this, new ko.b(14, new s(this)));
                        return;
                    }
                    kotlin.jvm.internal.i.q("editProfileViewModel");
                    throw null;
                }
            }
            vVar = (v) new o0(this).a(v.class);
            this.f11567w = vVar;
            if (vVar == null) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, e10);
            return;
        }
        z10 = false;
        this.K = z10;
        Window window2 = getWindow();
        if (Build.VERSION.SDK_INT >= 23) {
        }
        window2.setStatusBarColor(-1);
        this.G = true;
        u0();
        ((RobertoTextView) o0(R.id.tvEditProfileSave)).setPaintFlags(((RobertoTextView) o0(R.id.tvEditProfileSave)).getPaintFlags() | 8);
        ((RobertoTextView) o0(R.id.tvEditProfileSave)).setOnClickListener(new g(this, 0));
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        try {
            if (r0().isShowing()) {
                r0().dismiss();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11566v, e10);
        }
        super.onDestroy();
    }

    public final File q0() {
        String str = "profile_image" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        this.C = pl.a.f(str, ".jpg");
        File file = new File(getFilesDir(), "images");
        if (!file.exists()) {
            file.mkdirs();
        }
        File createTempFile = File.createTempFile(str, ".jpg", file);
        kotlin.jvm.internal.i.f(createTempFile, "createTempFile(\n        …/* directory */\n        )");
        return createTempFile;
    }

    public final Dialog r0() {
        return (Dialog) this.N.getValue();
    }

    public final void s0() {
        RobertoEditText robertoEditText;
        if (((RobertoEditText) o0(R.id.etEditProfileFirstName)).hasFocus()) {
            robertoEditText = (RobertoEditText) o0(R.id.etEditProfileFirstName);
        } else if (((RobertoEditText) o0(R.id.etEditProfileLastName)).hasFocus()) {
            robertoEditText = (RobertoEditText) o0(R.id.etEditProfileLastName);
        } else if (((RobertoEditText) o0(R.id.etEditProfileEmail)).hasFocus()) {
            robertoEditText = (RobertoEditText) o0(R.id.etEditProfileEmail);
        } else if (((RobertoEditText) o0(R.id.etEditProfilePhone)).hasFocus()) {
            robertoEditText = (RobertoEditText) o0(R.id.etEditProfilePhone);
        } else {
            robertoEditText = null;
        }
        if (robertoEditText != null) {
            Object systemService = getSystemService("input_method");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(robertoEditText.getWindowToken(), 0);
        }
    }

    public final void t0() {
        ((ProgressBar) o0(R.id.pbEditProfile)).setVisibility(8);
        ((ScrollView) o0(R.id.svEditProfile)).setVisibility(0);
        if (this.G) {
            ((ScrollView) o0(R.id.svEditProfile)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in_activity));
            this.G = false;
        }
    }

    public final void u0() {
        try {
            BottomSheetBehavior<ConstraintLayout> from = BottomSheetBehavior.from((ConstraintLayout) o0(R.id.clEditProfileBottomSheet));
            kotlin.jvm.internal.i.f(from, "from(clEditProfileBottomSheet)");
            this.A = from;
            from.addBottomSheetCallback(new c());
            o0(R.id.viewBottomSheetTint).setOnClickListener(new g(this, 2));
            ((RobertoButton) o0(R.id.btnEditProfileAddPhoto)).setOnClickListener(new g(this, 3));
            ((ConstraintLayout) o0(R.id.clEditProfileCameraLayout)).setOnClickListener(new g(this, 4));
            ((ConstraintLayout) o0(R.id.clEditProfileGalleryLayout)).setOnClickListener(new g(this, 5));
            ((ConstraintLayout) o0(R.id.clEditProfileAvatarLayout)).setOnClickListener(new g(this, 6));
            ((AppCompatImageView) o0(R.id.ivEditProfileBack)).setOnClickListener(new g(this, 7));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11566v, e10);
        }
    }

    public final void v0() {
        try {
            final Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_exit_edit_profile, this, R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
            ((RobertoTextView) styledDialog.findViewById(R.id.tvEditProfileExitNo)).setOnClickListener(new View.OnClickListener() { // from class: so.i
                /* JADX WARN: Code restructure failed: missing block: B:43:0x0136, code lost:
                    if (r11.length() > 15) goto L35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x0191, code lost:
                    if ((!gv.n.B0(r2.J)) != false) goto L52;
                 */
                /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x015d  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x016d  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x01a3  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view) {
                    boolean z10;
                    boolean z11;
                    Editable text;
                    boolean z12;
                    Editable text2;
                    boolean z13;
                    boolean z14;
                    boolean z15;
                    int i6 = r3;
                    ExperimentEditProfileActivity this$0 = this;
                    Dialog dialog = styledDialog;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentEditProfileActivity.P;
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(null, "edit_profile_discard_dialog_dismiss");
                            dialog.dismiss();
                            this$0.finish();
                            return;
                        default:
                            int i11 = ExperimentEditProfileActivity.P;
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            dialog.dismiss();
                            this$0.s0();
                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileLastName)).setError(null);
                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileFirstName)).setError(null);
                            ((TextInputLayout) this$0.o0(R.id.tilEditProfilePhone)).setError(null);
                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileEmail)).setError(null);
                            Editable text3 = ((RobertoEditText) this$0.o0(R.id.etEditProfileFirstName)).getText();
                            boolean z16 = false;
                            if (text3 != null && !gv.n.B0(text3)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                Editable text4 = ((RobertoEditText) this$0.o0(R.id.etEditProfileFirstName)).getText();
                                kotlin.jvm.internal.i.d(text4);
                                Pattern compile = Pattern.compile("^[^~!@#$%^&*()_+={}\\[\\]|\\\\:;“’<,>?๐฿]*$");
                                kotlin.jvm.internal.i.f(compile, "compile(pattern)");
                                if (compile.matcher(text4).matches()) {
                                    z11 = false;
                                    text = ((RobertoEditText) this$0.o0(R.id.etEditProfileLastName)).getText();
                                    if (text == null && !gv.n.B0(text)) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (!z12) {
                                        Editable text5 = ((RobertoEditText) this$0.o0(R.id.etEditProfileLastName)).getText();
                                        kotlin.jvm.internal.i.d(text5);
                                        Pattern compile2 = Pattern.compile("^[^~!@#$%^&*()_+={}\\[\\]|\\\\:;“’<,>?๐฿]*$");
                                        kotlin.jvm.internal.i.f(compile2, "compile(pattern)");
                                        if (!compile2.matcher(text5).matches()) {
                                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileLastName)).setError("Please enter valid name");
                                            z11 = true;
                                        }
                                    }
                                    text2 = ((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText();
                                    if (text2 == null && !gv.n.B0(text2)) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (!z13) {
                                        Editable text6 = ((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText();
                                        kotlin.jvm.internal.i.d(text6);
                                        if (text6.length() >= 8) {
                                            Editable text7 = ((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText();
                                            kotlin.jvm.internal.i.d(text7);
                                            break;
                                        }
                                        ((TextInputLayout) this$0.o0(R.id.tilEditProfilePhone)).setError("Please enter valid mobile number");
                                        z11 = true;
                                    }
                                    if (!Utils.INSTANCE.isValidEmail(String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileEmail)).getText()))) {
                                        ((TextInputLayout) this$0.o0(R.id.tilEditProfileEmail)).setError("Please enter a valid email");
                                        z11 = true;
                                    }
                                    if (this$0.K) {
                                        if (this$0.L) {
                                            Editable text8 = ((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText();
                                            if (text8 != null && !gv.n.B0(text8)) {
                                                z15 = false;
                                            } else {
                                                z15 = true;
                                            }
                                            if (z15) {
                                                break;
                                            }
                                        }
                                        ((TextInputLayout) this$0.o0(R.id.tilEditProfilePhone)).setError("Please verify your number");
                                        z11 = true;
                                    }
                                    if (z11) {
                                        wo.v vVar = this$0.f11567w;
                                        if (vVar != null) {
                                            vVar.e(String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileFirstName)).getText()), String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileLastName)).getText()), String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileEmail)).getText()), String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText()), ((CountryCodePicker) this$0.o0(R.id.ccpEditProfile)).getSelectedCountryCode().toString(), this$0.C, this$0.f11570z, this$0.D, this$0.f11569y, this$0.f11568x);
                                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileLastName)).setError(null);
                                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileFirstName)).setError(null);
                                            ((TextInputLayout) this$0.o0(R.id.tilEditProfilePhone)).setError(null);
                                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileEmail)).setError(null);
                                            String str = gk.a.f16573a;
                                            Bundle a10 = r1.b0.a("variant", "new");
                                            String str2 = this$0.f11569y;
                                            if (str2 != null && str2.length() != 0) {
                                                z14 = false;
                                            } else {
                                                z14 = true;
                                            }
                                            if (!z14) {
                                                a10.putString("selectedAvatar", this$0.f11569y);
                                            } else {
                                                Uri uri = this$0.f11570z;
                                                if (uri != null && this$0.D) {
                                                    a10.putString("selectedAvatar", "camera_image");
                                                } else if (uri != null && !this$0.D) {
                                                    a10.putString("selectedAvatar", "gallery_image");
                                                } else {
                                                    a10.putString("selectedAvatar", "unchanged");
                                                }
                                            }
                                            String str3 = this$0.f11568x;
                                            if (!((str3 == null || str3.length() == 0) ? true : true)) {
                                                a10.putString("selectedTheme", this$0.f11568x);
                                            } else {
                                                a10.putString("selectedTheme", "unchanged");
                                            }
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(a10, "edit_profile_discard_dialog_save");
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("editProfileViewModel");
                                        throw null;
                                    }
                                    return;
                                }
                            }
                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileFirstName)).setError("Please enter valid name");
                            z11 = true;
                            text = ((RobertoEditText) this$0.o0(R.id.etEditProfileLastName)).getText();
                            if (text == null) {
                            }
                            z12 = true;
                            if (!z12) {
                            }
                            text2 = ((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText();
                            if (text2 == null) {
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (!Utils.INSTANCE.isValidEmail(String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileEmail)).getText()))) {
                            }
                            if (this$0.K) {
                            }
                            if (z11) {
                            }
                            break;
                    }
                }
            });
            ((RobertoTextView) styledDialog.findViewById(R.id.tvEditProfileExitYes)).setOnClickListener(new View.OnClickListener() { // from class: so.i
                /* JADX WARN: Code restructure failed: missing block: B:43:0x0136, code lost:
                    if (r11.length() > 15) goto L35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x0191, code lost:
                    if ((!gv.n.B0(r2.J)) != false) goto L52;
                 */
                /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x015d  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x016d  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x01a3  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view) {
                    boolean z10;
                    boolean z11;
                    Editable text;
                    boolean z12;
                    Editable text2;
                    boolean z13;
                    boolean z14;
                    boolean z15;
                    int i6 = r3;
                    ExperimentEditProfileActivity this$0 = this;
                    Dialog dialog = styledDialog;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentEditProfileActivity.P;
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(null, "edit_profile_discard_dialog_dismiss");
                            dialog.dismiss();
                            this$0.finish();
                            return;
                        default:
                            int i11 = ExperimentEditProfileActivity.P;
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            dialog.dismiss();
                            this$0.s0();
                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileLastName)).setError(null);
                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileFirstName)).setError(null);
                            ((TextInputLayout) this$0.o0(R.id.tilEditProfilePhone)).setError(null);
                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileEmail)).setError(null);
                            Editable text3 = ((RobertoEditText) this$0.o0(R.id.etEditProfileFirstName)).getText();
                            boolean z16 = false;
                            if (text3 != null && !gv.n.B0(text3)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                Editable text4 = ((RobertoEditText) this$0.o0(R.id.etEditProfileFirstName)).getText();
                                kotlin.jvm.internal.i.d(text4);
                                Pattern compile = Pattern.compile("^[^~!@#$%^&*()_+={}\\[\\]|\\\\:;“’<,>?๐฿]*$");
                                kotlin.jvm.internal.i.f(compile, "compile(pattern)");
                                if (compile.matcher(text4).matches()) {
                                    z11 = false;
                                    text = ((RobertoEditText) this$0.o0(R.id.etEditProfileLastName)).getText();
                                    if (text == null && !gv.n.B0(text)) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (!z12) {
                                        Editable text5 = ((RobertoEditText) this$0.o0(R.id.etEditProfileLastName)).getText();
                                        kotlin.jvm.internal.i.d(text5);
                                        Pattern compile2 = Pattern.compile("^[^~!@#$%^&*()_+={}\\[\\]|\\\\:;“’<,>?๐฿]*$");
                                        kotlin.jvm.internal.i.f(compile2, "compile(pattern)");
                                        if (!compile2.matcher(text5).matches()) {
                                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileLastName)).setError("Please enter valid name");
                                            z11 = true;
                                        }
                                    }
                                    text2 = ((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText();
                                    if (text2 == null && !gv.n.B0(text2)) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (!z13) {
                                        Editable text6 = ((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText();
                                        kotlin.jvm.internal.i.d(text6);
                                        if (text6.length() >= 8) {
                                            Editable text7 = ((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText();
                                            kotlin.jvm.internal.i.d(text7);
                                            break;
                                        }
                                        ((TextInputLayout) this$0.o0(R.id.tilEditProfilePhone)).setError("Please enter valid mobile number");
                                        z11 = true;
                                    }
                                    if (!Utils.INSTANCE.isValidEmail(String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileEmail)).getText()))) {
                                        ((TextInputLayout) this$0.o0(R.id.tilEditProfileEmail)).setError("Please enter a valid email");
                                        z11 = true;
                                    }
                                    if (this$0.K) {
                                        if (this$0.L) {
                                            Editable text8 = ((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText();
                                            if (text8 != null && !gv.n.B0(text8)) {
                                                z15 = false;
                                            } else {
                                                z15 = true;
                                            }
                                            if (z15) {
                                                break;
                                            }
                                        }
                                        ((TextInputLayout) this$0.o0(R.id.tilEditProfilePhone)).setError("Please verify your number");
                                        z11 = true;
                                    }
                                    if (z11) {
                                        wo.v vVar = this$0.f11567w;
                                        if (vVar != null) {
                                            vVar.e(String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileFirstName)).getText()), String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileLastName)).getText()), String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileEmail)).getText()), String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText()), ((CountryCodePicker) this$0.o0(R.id.ccpEditProfile)).getSelectedCountryCode().toString(), this$0.C, this$0.f11570z, this$0.D, this$0.f11569y, this$0.f11568x);
                                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileLastName)).setError(null);
                                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileFirstName)).setError(null);
                                            ((TextInputLayout) this$0.o0(R.id.tilEditProfilePhone)).setError(null);
                                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileEmail)).setError(null);
                                            String str = gk.a.f16573a;
                                            Bundle a10 = r1.b0.a("variant", "new");
                                            String str2 = this$0.f11569y;
                                            if (str2 != null && str2.length() != 0) {
                                                z14 = false;
                                            } else {
                                                z14 = true;
                                            }
                                            if (!z14) {
                                                a10.putString("selectedAvatar", this$0.f11569y);
                                            } else {
                                                Uri uri = this$0.f11570z;
                                                if (uri != null && this$0.D) {
                                                    a10.putString("selectedAvatar", "camera_image");
                                                } else if (uri != null && !this$0.D) {
                                                    a10.putString("selectedAvatar", "gallery_image");
                                                } else {
                                                    a10.putString("selectedAvatar", "unchanged");
                                                }
                                            }
                                            String str3 = this$0.f11568x;
                                            if (!((str3 == null || str3.length() == 0) ? true : true)) {
                                                a10.putString("selectedTheme", this$0.f11568x);
                                            } else {
                                                a10.putString("selectedTheme", "unchanged");
                                            }
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(a10, "edit_profile_discard_dialog_save");
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("editProfileViewModel");
                                        throw null;
                                    }
                                    return;
                                }
                            }
                            ((TextInputLayout) this$0.o0(R.id.tilEditProfileFirstName)).setError("Please enter valid name");
                            z11 = true;
                            text = ((RobertoEditText) this$0.o0(R.id.etEditProfileLastName)).getText();
                            if (text == null) {
                            }
                            z12 = true;
                            if (!z12) {
                            }
                            text2 = ((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText();
                            if (text2 == null) {
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (!Utils.INSTANCE.isValidEmail(String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileEmail)).getText()))) {
                            }
                            if (this$0.K) {
                            }
                            if (z11) {
                            }
                            break;
                    }
                }
            });
            styledDialog.show();
            gk.a.b(null, "edit_profile_discard_dialog_show");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11566v, e10);
        }
    }

    /* compiled from: ExperimentEditProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends BottomSheetBehavior.f {
        public c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void c(int i6, View view) {
            ExperimentEditProfileActivity experimentEditProfileActivity = ExperimentEditProfileActivity.this;
            if (i6 != 3) {
                if (i6 == 4) {
                    experimentEditProfileActivity.o0(R.id.viewBottomSheetTint).setVisibility(8);
                    return;
                }
                return;
            }
            experimentEditProfileActivity.o0(R.id.viewBottomSheetTint).setVisibility(0);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void b(View view) {
        }
    }
}
