package so;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.hbb20.CountryCodePicker;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentAddFamilyMemberActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.components.profile.experiment.model.ProfileAssetModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.CircleImageView;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Pattern;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f31810u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31811v;

    public /* synthetic */ g(ExperimentEditProfileActivity experimentEditProfileActivity, int i6) {
        this.f31810u = i6;
        this.f31811v = experimentEditProfileActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0464, code lost:
        if (r4.length() > 15) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04df, code lost:
        if ((!gv.n.B0(r12.J)) != false) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
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
        Uri uri;
        Editable editable;
        boolean z16 = false;
        int i6 = this.f31810u;
        ExperimentEditProfileActivity this$0 = this.f31811v;
        File file = null;
        boolean z17 = true;
        switch (i6) {
            case 0:
                int i10 = ExperimentEditProfileActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.s0();
                ((TextInputLayout) this$0.o0(R.id.tilEditProfileFirstName)).setError(null);
                ((TextInputLayout) this$0.o0(R.id.tilEditProfileLastName)).setError(null);
                ((TextInputLayout) this$0.o0(R.id.tilEditProfilePhone)).setError(null);
                ((TextInputLayout) this$0.o0(R.id.tilEditProfileEmail)).setError(null);
                Editable text3 = ((RobertoEditText) this$0.o0(R.id.etEditProfileFirstName)).getText();
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
                        if (!gv.n.B0(String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileEmail)).getText()))) {
                            this$0.M = String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileEmail)).getText());
                        }
                        if (!gv.n.B0(this$0.M) || !Utils.INSTANCE.isValidEmail(this$0.M)) {
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
                                vVar.e(String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileFirstName)).getText()), String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileLastName)).getText()), this$0.M, String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText()), ((CountryCodePicker) this$0.o0(R.id.ccpEditProfile)).getSelectedCountryCode().toString(), this$0.C, this$0.f11570z, this$0.D, this$0.f11569y, this$0.f11568x);
                                ((TextInputLayout) this$0.o0(R.id.tilEditProfileFirstName)).setError(null);
                                ((TextInputLayout) this$0.o0(R.id.tilEditProfileLastName)).setError(null);
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
                                    Uri uri2 = this$0.f11570z;
                                    if (uri2 != null && this$0.D) {
                                        a10.putString("selectedAvatar", "camera_image");
                                    } else if (uri2 != null && !this$0.D) {
                                        a10.putString("selectedAvatar", "gallery_image");
                                    } else {
                                        a10.putString("selectedAvatar", "unchanged");
                                    }
                                }
                                String str3 = this$0.f11568x;
                                if (str3 != null && str3.length() != 0) {
                                    z17 = false;
                                }
                                if (!z17) {
                                    a10.putString("selectedTheme", this$0.f11568x);
                                } else {
                                    a10.putString("selectedTheme", "unchanged");
                                }
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(a10, "edit_profile_save_click");
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
                if (!gv.n.B0(String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfileEmail)).getText()))) {
                }
                if (!gv.n.B0(this$0.M)) {
                }
                ((TextInputLayout) this$0.o0(R.id.tilEditProfileEmail)).setError("Please enter a valid email");
                z11 = true;
                if (this$0.K) {
                }
                if (z11) {
                }
                break;
            case 1:
                int i11 = ExperimentEditProfileActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String valueOf = String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText());
                Pattern compile3 = Pattern.compile("^[0-9]{10}$");
                kotlin.jvm.internal.i.f(compile3, "compile(pattern)");
                if (compile3.matcher(valueOf).matches()) {
                    wo.v vVar2 = this$0.f11567w;
                    if (vVar2 != null) {
                        ta.v.H(kc.f.H(vVar2), null, 0, new wo.w(vVar2, String.valueOf(((RobertoEditText) this$0.o0(R.id.etEditProfilePhone)).getText()), true, null), 3);
                        return;
                    }
                    kotlin.jvm.internal.i.q("editProfileViewModel");
                    throw null;
                }
                return;
            case 2:
                int i12 = ExperimentEditProfileActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.A;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(4);
                    return;
                } else {
                    kotlin.jvm.internal.i.q("bottomSheetBehavior");
                    throw null;
                }
            case 3:
                int i13 = ExperimentEditProfileActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.s0();
                BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.A;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.setState(3);
                    gk.a.b(null, "edit_profile_edit_picture_click");
                    return;
                }
                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                throw null;
            case 4:
                int i14 = ExperimentEditProfileActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.A;
                if (bottomSheetBehavior3 != null) {
                    bottomSheetBehavior3.setState(4);
                    if (g0.a.a(this$0, "android.permission.CAMERA") == 0) {
                        String str4 = this$0.f11566v;
                        try {
                            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                            if (intent.resolveActivity(this$0.getPackageManager()) != null) {
                                try {
                                    file = this$0.q0();
                                } catch (IOException e10) {
                                    LogHelper.INSTANCE.e(str4, e10);
                                }
                                if (file != null) {
                                    Uri b10 = FileProvider.b(this$0, "com.theinnerhour.b2b.provider", file);
                                    kotlin.jvm.internal.i.f(b10, "getUriForFile(\n         …                        )");
                                    this$0.B = b10;
                                    intent.putExtra("output", b10);
                                    this$0.startActivityForResult(intent, com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                                }
                            }
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(str4, e11);
                        }
                    } else if (f0.a.f(this$0, "android.permission.CAMERA")) {
                        b.a aVar = new b.a(this$0);
                        AlertController.b bVar = aVar.f1046a;
                        bVar.f1036l = true;
                        bVar.f1028c = R.drawable.ic_amaha_logo_white_bg;
                        aVar.setTitle("Permission necessary");
                        bVar.f1031g = "Camera permission is necessary";
                        aVar.setPositiveButton(17039379, new g6.g(10, this$0));
                        androidx.appcompat.app.b create = aVar.create();
                        kotlin.jvm.internal.i.f(create, "alertBuilder.create()");
                        create.show();
                    } else {
                        f0.a.e(this$0, this$0.E, com.appsflyer.R.styleable.AppCompatTheme_textColorSearchUrl);
                    }
                    String str5 = gk.a.f16573a;
                    Bundle a11 = r1.b0.a("value", "camera");
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(a11, "edit_profile_picture_option_select");
                    return;
                }
                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                throw null;
            case 5:
                int i15 = ExperimentEditProfileActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.A;
                if (bottomSheetBehavior4 != null) {
                    bottomSheetBehavior4.setState(4);
                    if (Build.VERSION.SDK_INT >= 29) {
                        uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                        Intent intent2 = new Intent("android.intent.action.PICK", uri);
                        intent2.setType("image/*");
                        this$0.startActivityForResult(Intent.createChooser(intent2, "Select File"), com.appsflyer.R.styleable.AppCompatTheme_toolbarStyle);
                    } else {
                        Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent3.addCategory("android.intent.category.OPENABLE");
                        intent3.setType("image/*");
                        this$0.startActivityForResult(intent3, com.appsflyer.R.styleable.AppCompatTheme_toolbarStyle);
                    }
                    String str6 = gk.a.f16573a;
                    Bundle a12 = r1.b0.a("value", "gallery");
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(a12, "edit_profile_picture_option_select");
                    return;
                }
                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                throw null;
            case 6:
                int i16 = ExperimentEditProfileActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.A;
                if (bottomSheetBehavior5 != null) {
                    bottomSheetBehavior5.setState(4);
                    try {
                        kotlin.jvm.internal.v vVar3 = new kotlin.jvm.internal.v();
                        vVar3.f23467u = -1;
                        UiUtils.Companion companion = UiUtils.Companion;
                        Dialog styledDialog = companion.getStyledDialog(R.layout.dialog_avatar_select, this$0, R.style.Theme_Dialog_Fullscreen);
                        Window window = styledDialog.getWindow();
                        if (window != null) {
                            window.setLayout(-1, -1);
                        }
                        ((RecyclerView) styledDialog.findViewById(R.id.rvAvatarDialog)).setLayoutManager(new GridLayoutManager(this$0, 3));
                        ((RecyclerView) styledDialog.findViewById(R.id.rvAvatarDialog)).g(new to.d(companion.dpToPx(this$0, 16)));
                        Iterator it = is.u.N2(this$0.F).iterator();
                        while (true) {
                            is.b0 b0Var = (is.b0) it;
                            if (b0Var.hasNext()) {
                                is.z zVar = (is.z) b0Var.next();
                                T t3 = zVar.f20680b;
                                if (kotlin.jvm.internal.i.b(((ProfileAssetModel.ProfileAvatarAsset) t3).getAvatar(), "https:" + FirebasePersistence.getInstance().getUser().getProfile_path())) {
                                    ((ProfileAssetModel.ProfileAvatarAsset) t3).setSelected(true);
                                    vVar3.f23467u = zVar.f20679a;
                                    Glide.c(this$0).d(this$0).p(((ProfileAssetModel.ProfileAvatarAsset) t3).getAvatar()).B((CircleImageView) styledDialog.findViewById(R.id.ivAvatarDialogImage));
                                    z16 = true;
                                }
                            }
                        }
                        if (!z16) {
                            Iterator it2 = is.u.N2(this$0.F).iterator();
                            while (true) {
                                is.b0 b0Var2 = (is.b0) it2;
                                if (b0Var2.hasNext()) {
                                    is.z zVar2 = (is.z) b0Var2.next();
                                    T t10 = zVar2.f20680b;
                                    if (((ProfileAssetModel.ProfileAvatarAsset) t10).getDefault()) {
                                        ((ProfileAssetModel.ProfileAvatarAsset) t10).setSelected(true);
                                        vVar3.f23467u = zVar2.f20679a;
                                        Glide.c(this$0).d(this$0).p(((ProfileAssetModel.ProfileAvatarAsset) t10).getAvatar()).B((CircleImageView) styledDialog.findViewById(R.id.ivAvatarDialogImage));
                                    }
                                }
                            }
                        }
                        ((RecyclerView) styledDialog.findViewById(R.id.rvAvatarDialog)).setAdapter(new to.a(this$0, this$0.F, new k(vVar3, this$0, styledDialog)));
                        ((AppCompatImageView) styledDialog.findViewById(R.id.ivAvatarDialogBack)).setOnClickListener(new lm.f(styledDialog, 21));
                        styledDialog.show();
                    } catch (Exception e12) {
                        LogHelper.INSTANCE.e(this$0.f11566v, e12);
                    }
                    String str7 = gk.a.f16573a;
                    Bundle a13 = r1.b0.a("value", "avatar");
                    hs.k kVar4 = hs.k.f19476a;
                    gk.a.b(a13, "edit_profile_picture_option_select");
                    return;
                }
                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                throw null;
            case 7:
                ExperimentEditProfileActivity.n0(this$0);
                return;
            case 8:
                int i17 = ExperimentEditProfileActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.r0().dismiss();
                return;
            case 9:
                int i18 = ExperimentEditProfileActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (kotlin.jvm.internal.i.b(((RobertoTextView) this$0.r0().findViewById(R.id.tvOTPDialogTimer)).getText(), "00:00")) {
                    String str8 = gk.a.f16573a;
                    Bundle a14 = r1.b0.a("source", "profile_section");
                    hs.k kVar5 = hs.k.f19476a;
                    gk.a.b(a14, "auth_verify_otp_resend");
                    wo.v vVar4 = this$0.f11567w;
                    if (vVar4 != null) {
                        RobertoEditText robertoEditText = (RobertoEditText) this$0.o0(R.id.etEditProfilePhone);
                        if (robertoEditText != null) {
                            editable = robertoEditText.getText();
                        } else {
                            editable = null;
                        }
                        ta.v.H(kc.f.H(vVar4), null, 0, new wo.w(vVar4, String.valueOf(editable), true, null), 3);
                        wo.v vVar5 = this$0.f11567w;
                        if (vVar5 != null) {
                            vVar5.f();
                            RobertoTextView robertoTextView = (RobertoTextView) this$0.r0().findViewById(R.id.tvOTPDialogResend);
                            if (robertoTextView != null) {
                                robertoTextView.setAlpha(0.2f);
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.i.q("editProfileViewModel");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("editProfileViewModel");
                    throw null;
                }
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivity(new Intent(this$0, ExperimentAddFamilyMemberActivity.class));
                return;
        }
    }
}
