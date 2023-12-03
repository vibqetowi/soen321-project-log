package nn;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: CC1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/s0;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s0 extends rn.b {
    public static final /* synthetic */ int G = 0;
    public final LinkedHashMap F = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public String f26594w = "";

    /* renamed from: x  reason: collision with root package name */
    public String f26595x = "";

    /* renamed from: y  reason: collision with root package name */
    public String f26596y = "";

    /* renamed from: z  reason: collision with root package name */
    public String f26597z = "";
    public String A = "";
    public String B = "";
    public String C = "";
    public ArrayList<String> D = new ArrayList<>();
    public final String E = LogHelper.INSTANCE.makeLogTag(s0.class);

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00fc A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0106 A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0112 A[Catch: Exception -> 0x0115, TRY_LEAVE, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084 A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094 A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8 A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c8 A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2 A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e2 A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ec A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:18:0x0030, B:19:0x0039, B:21:0x0041, B:30:0x0051, B:31:0x0062, B:33:0x006a, B:42:0x007a, B:43:0x007c, B:45:0x0084, B:54:0x0094, B:55:0x0096, B:57:0x009e, B:66:0x00ae, B:67:0x00b0, B:69:0x00b8, B:78:0x00c8, B:79:0x00ca, B:81:0x00d2, B:90:0x00e2, B:91:0x00e4, B:93:0x00ec, B:102:0x00fc, B:103:0x00fe, B:105:0x0106, B:111:0x0112), top: B:116:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z10;
        String str;
        String string;
        boolean z11;
        String string2;
        boolean z12;
        String string3;
        boolean z13;
        String string4;
        boolean z14;
        String string5;
        boolean z15;
        String string6;
        boolean z16;
        String string7;
        boolean z17;
        String string8;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.D = F().J();
                String string9 = arguments.getString("cc1_cta", "");
                boolean z18 = false;
                if (string9 != null && string9.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string9 = null;
                    }
                    if (string9 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setText(string9);
                    }
                    string = arguments.getString("template_color", "");
                    if (string != null && string.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            string = null;
                        }
                        if (string != null) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setTextColor(ColorStateList.valueOf(Color.parseColor(string)));
                        }
                        string2 = arguments.getString("cc1_coupon_dialog_banner", "");
                        if (string2 != null && string2.length() != 0) {
                            z12 = false;
                            if (!z12) {
                                string2 = null;
                            }
                            if (string2 != null) {
                                this.f26594w = string2;
                            }
                            string3 = arguments.getString("cc1_popup_title", "");
                            if (string3 != null && string3.length() != 0) {
                                z13 = false;
                                if (!z13) {
                                    string3 = null;
                                }
                                if (string3 != null) {
                                    this.f26595x = string3;
                                }
                                string4 = arguments.getString("cc1_popup_help", "");
                                if (string4 != null && string4.length() != 0) {
                                    z14 = false;
                                    if (!z14) {
                                        string4 = null;
                                    }
                                    if (string4 != null) {
                                        this.f26596y = string4;
                                    }
                                    string5 = arguments.getString("cc1_popup_cta", "");
                                    if (string5 != null && string5.length() != 0) {
                                        z15 = false;
                                        if (!z15) {
                                            string5 = null;
                                        }
                                        if (string5 != null) {
                                            this.f26597z = string5;
                                        }
                                        string6 = arguments.getString("cc1_popup_cta_color", "");
                                        if (string6 != null && string6.length() != 0) {
                                            z16 = false;
                                            if (!z16) {
                                                string6 = null;
                                            }
                                            if (string6 != null) {
                                                this.A = string6;
                                            }
                                            string7 = arguments.getString("cc1_free_asset", "");
                                            if (string7 != null && string7.length() != 0) {
                                                z17 = false;
                                                if (!z17) {
                                                    string7 = null;
                                                }
                                                if (string7 != null) {
                                                    this.B = string7;
                                                }
                                                string8 = arguments.getString("screen", "");
                                                if (!((string8 != null || string8.length() == 0) ? true : true)) {
                                                    str = string8;
                                                }
                                                if (str == null) {
                                                    this.C = str;
                                                    return;
                                                }
                                                return;
                                            }
                                            z17 = true;
                                            if (!z17) {
                                            }
                                            if (string7 != null) {
                                            }
                                            string8 = arguments.getString("screen", "");
                                            if (!((string8 != null || string8.length() == 0) ? true : true)) {
                                            }
                                            if (str == null) {
                                            }
                                        }
                                        z16 = true;
                                        if (!z16) {
                                        }
                                        if (string6 != null) {
                                        }
                                        string7 = arguments.getString("cc1_free_asset", "");
                                        if (string7 != null) {
                                            z17 = false;
                                            if (!z17) {
                                            }
                                            if (string7 != null) {
                                            }
                                            string8 = arguments.getString("screen", "");
                                            if (!((string8 != null || string8.length() == 0) ? true : true)) {
                                            }
                                            if (str == null) {
                                            }
                                        }
                                        z17 = true;
                                        if (!z17) {
                                        }
                                        if (string7 != null) {
                                        }
                                        string8 = arguments.getString("screen", "");
                                        if (!((string8 != null || string8.length() == 0) ? true : true)) {
                                        }
                                        if (str == null) {
                                        }
                                    }
                                    z15 = true;
                                    if (!z15) {
                                    }
                                    if (string5 != null) {
                                    }
                                    string6 = arguments.getString("cc1_popup_cta_color", "");
                                    if (string6 != null) {
                                        z16 = false;
                                        if (!z16) {
                                        }
                                        if (string6 != null) {
                                        }
                                        string7 = arguments.getString("cc1_free_asset", "");
                                        if (string7 != null) {
                                        }
                                        z17 = true;
                                        if (!z17) {
                                        }
                                        if (string7 != null) {
                                        }
                                        string8 = arguments.getString("screen", "");
                                        if (!((string8 != null || string8.length() == 0) ? true : true)) {
                                        }
                                        if (str == null) {
                                        }
                                    }
                                    z16 = true;
                                    if (!z16) {
                                    }
                                    if (string6 != null) {
                                    }
                                    string7 = arguments.getString("cc1_free_asset", "");
                                    if (string7 != null) {
                                    }
                                    z17 = true;
                                    if (!z17) {
                                    }
                                    if (string7 != null) {
                                    }
                                    string8 = arguments.getString("screen", "");
                                    if (!((string8 != null || string8.length() == 0) ? true : true)) {
                                    }
                                    if (str == null) {
                                    }
                                }
                                z14 = true;
                                if (!z14) {
                                }
                                if (string4 != null) {
                                }
                                string5 = arguments.getString("cc1_popup_cta", "");
                                if (string5 != null) {
                                    z15 = false;
                                    if (!z15) {
                                    }
                                    if (string5 != null) {
                                    }
                                    string6 = arguments.getString("cc1_popup_cta_color", "");
                                    if (string6 != null) {
                                    }
                                    z16 = true;
                                    if (!z16) {
                                    }
                                    if (string6 != null) {
                                    }
                                    string7 = arguments.getString("cc1_free_asset", "");
                                    if (string7 != null) {
                                    }
                                    z17 = true;
                                    if (!z17) {
                                    }
                                    if (string7 != null) {
                                    }
                                    string8 = arguments.getString("screen", "");
                                    if (!((string8 != null || string8.length() == 0) ? true : true)) {
                                    }
                                    if (str == null) {
                                    }
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (string5 != null) {
                                }
                                string6 = arguments.getString("cc1_popup_cta_color", "");
                                if (string6 != null) {
                                }
                                z16 = true;
                                if (!z16) {
                                }
                                if (string6 != null) {
                                }
                                string7 = arguments.getString("cc1_free_asset", "");
                                if (string7 != null) {
                                }
                                z17 = true;
                                if (!z17) {
                                }
                                if (string7 != null) {
                                }
                                string8 = arguments.getString("screen", "");
                                if (!((string8 != null || string8.length() == 0) ? true : true)) {
                                }
                                if (str == null) {
                                }
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (string3 != null) {
                            }
                            string4 = arguments.getString("cc1_popup_help", "");
                            if (string4 != null) {
                                z14 = false;
                                if (!z14) {
                                }
                                if (string4 != null) {
                                }
                                string5 = arguments.getString("cc1_popup_cta", "");
                                if (string5 != null) {
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (string5 != null) {
                                }
                                string6 = arguments.getString("cc1_popup_cta_color", "");
                                if (string6 != null) {
                                }
                                z16 = true;
                                if (!z16) {
                                }
                                if (string6 != null) {
                                }
                                string7 = arguments.getString("cc1_free_asset", "");
                                if (string7 != null) {
                                }
                                z17 = true;
                                if (!z17) {
                                }
                                if (string7 != null) {
                                }
                                string8 = arguments.getString("screen", "");
                                if (!((string8 != null || string8.length() == 0) ? true : true)) {
                                }
                                if (str == null) {
                                }
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (string4 != null) {
                            }
                            string5 = arguments.getString("cc1_popup_cta", "");
                            if (string5 != null) {
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            if (string5 != null) {
                            }
                            string6 = arguments.getString("cc1_popup_cta_color", "");
                            if (string6 != null) {
                            }
                            z16 = true;
                            if (!z16) {
                            }
                            if (string6 != null) {
                            }
                            string7 = arguments.getString("cc1_free_asset", "");
                            if (string7 != null) {
                            }
                            z17 = true;
                            if (!z17) {
                            }
                            if (string7 != null) {
                            }
                            string8 = arguments.getString("screen", "");
                            if (!((string8 != null || string8.length() == 0) ? true : true)) {
                            }
                            if (str == null) {
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        if (string2 != null) {
                        }
                        string3 = arguments.getString("cc1_popup_title", "");
                        if (string3 != null) {
                            z13 = false;
                            if (!z13) {
                            }
                            if (string3 != null) {
                            }
                            string4 = arguments.getString("cc1_popup_help", "");
                            if (string4 != null) {
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (string4 != null) {
                            }
                            string5 = arguments.getString("cc1_popup_cta", "");
                            if (string5 != null) {
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            if (string5 != null) {
                            }
                            string6 = arguments.getString("cc1_popup_cta_color", "");
                            if (string6 != null) {
                            }
                            z16 = true;
                            if (!z16) {
                            }
                            if (string6 != null) {
                            }
                            string7 = arguments.getString("cc1_free_asset", "");
                            if (string7 != null) {
                            }
                            z17 = true;
                            if (!z17) {
                            }
                            if (string7 != null) {
                            }
                            string8 = arguments.getString("screen", "");
                            if (!((string8 != null || string8.length() == 0) ? true : true)) {
                            }
                            if (str == null) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (string3 != null) {
                        }
                        string4 = arguments.getString("cc1_popup_help", "");
                        if (string4 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (string4 != null) {
                        }
                        string5 = arguments.getString("cc1_popup_cta", "");
                        if (string5 != null) {
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        if (string5 != null) {
                        }
                        string6 = arguments.getString("cc1_popup_cta_color", "");
                        if (string6 != null) {
                        }
                        z16 = true;
                        if (!z16) {
                        }
                        if (string6 != null) {
                        }
                        string7 = arguments.getString("cc1_free_asset", "");
                        if (string7 != null) {
                        }
                        z17 = true;
                        if (!z17) {
                        }
                        if (string7 != null) {
                        }
                        string8 = arguments.getString("screen", "");
                        if (!((string8 != null || string8.length() == 0) ? true : true)) {
                        }
                        if (str == null) {
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    string2 = arguments.getString("cc1_coupon_dialog_banner", "");
                    if (string2 != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (string2 != null) {
                        }
                        string3 = arguments.getString("cc1_popup_title", "");
                        if (string3 != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (string3 != null) {
                        }
                        string4 = arguments.getString("cc1_popup_help", "");
                        if (string4 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (string4 != null) {
                        }
                        string5 = arguments.getString("cc1_popup_cta", "");
                        if (string5 != null) {
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        if (string5 != null) {
                        }
                        string6 = arguments.getString("cc1_popup_cta_color", "");
                        if (string6 != null) {
                        }
                        z16 = true;
                        if (!z16) {
                        }
                        if (string6 != null) {
                        }
                        string7 = arguments.getString("cc1_free_asset", "");
                        if (string7 != null) {
                        }
                        z17 = true;
                        if (!z17) {
                        }
                        if (string7 != null) {
                        }
                        string8 = arguments.getString("screen", "");
                        if (!((string8 != null || string8.length() == 0) ? true : true)) {
                        }
                        if (str == null) {
                        }
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (string2 != null) {
                    }
                    string3 = arguments.getString("cc1_popup_title", "");
                    if (string3 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (string3 != null) {
                    }
                    string4 = arguments.getString("cc1_popup_help", "");
                    if (string4 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (string4 != null) {
                    }
                    string5 = arguments.getString("cc1_popup_cta", "");
                    if (string5 != null) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (string5 != null) {
                    }
                    string6 = arguments.getString("cc1_popup_cta_color", "");
                    if (string6 != null) {
                    }
                    z16 = true;
                    if (!z16) {
                    }
                    if (string6 != null) {
                    }
                    string7 = arguments.getString("cc1_free_asset", "");
                    if (string7 != null) {
                    }
                    z17 = true;
                    if (!z17) {
                    }
                    if (string7 != null) {
                    }
                    string8 = arguments.getString("screen", "");
                    if (!((string8 != null || string8.length() == 0) ? true : true)) {
                    }
                    if (str == null) {
                    }
                }
                z10 = true;
                str = null;
                if (!z10) {
                }
                if (string9 != null) {
                }
                string = arguments.getString("template_color", "");
                if (string != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    string2 = arguments.getString("cc1_coupon_dialog_banner", "");
                    if (string2 != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (string2 != null) {
                    }
                    string3 = arguments.getString("cc1_popup_title", "");
                    if (string3 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (string3 != null) {
                    }
                    string4 = arguments.getString("cc1_popup_help", "");
                    if (string4 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (string4 != null) {
                    }
                    string5 = arguments.getString("cc1_popup_cta", "");
                    if (string5 != null) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (string5 != null) {
                    }
                    string6 = arguments.getString("cc1_popup_cta_color", "");
                    if (string6 != null) {
                    }
                    z16 = true;
                    if (!z16) {
                    }
                    if (string6 != null) {
                    }
                    string7 = arguments.getString("cc1_free_asset", "");
                    if (string7 != null) {
                    }
                    z17 = true;
                    if (!z17) {
                    }
                    if (string7 != null) {
                    }
                    string8 = arguments.getString("screen", "");
                    if (!((string8 != null || string8.length() == 0) ? true : true)) {
                    }
                    if (str == null) {
                    }
                }
                z11 = true;
                if (!z11) {
                }
                if (string != null) {
                }
                string2 = arguments.getString("cc1_coupon_dialog_banner", "");
                if (string2 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (string2 != null) {
                }
                string3 = arguments.getString("cc1_popup_title", "");
                if (string3 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (string3 != null) {
                }
                string4 = arguments.getString("cc1_popup_help", "");
                if (string4 != null) {
                }
                z14 = true;
                if (!z14) {
                }
                if (string4 != null) {
                }
                string5 = arguments.getString("cc1_popup_cta", "");
                if (string5 != null) {
                }
                z15 = true;
                if (!z15) {
                }
                if (string5 != null) {
                }
                string6 = arguments.getString("cc1_popup_cta_color", "");
                if (string6 != null) {
                }
                z16 = true;
                if (!z16) {
                }
                if (string6 != null) {
                }
                string7 = arguments.getString("cc1_free_asset", "");
                if (string7 != null) {
                }
                z17 = true;
                if (!z17) {
                }
                if (string7 != null) {
                }
                string8 = arguments.getString("screen", "");
                if (!((string8 != null || string8.length() == 0) ? true : true)) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.E, e10);
        }
    }

    public final void J(String str, String str2, String str3) {
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeCouponTitle)).setText(str);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeCouponSubText)).setText(str2);
            ((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedFreeText)).setText(str3);
            ((AppCompatImageView) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedFreeRemove)).setOnClickListener(new q0(this, 1));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.E, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.F.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.F;
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
        return inflater.inflate(R.layout.fragment_cc1, viewGroup, false);
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
            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setPaintFlags(8 | ((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponCTA)).getPaintFlags());
            ((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setOnClickListener(new q0(this, 0));
            if (!kotlin.jvm.internal.i.b(this.B, "") && getActivity() != null) {
                Glide.i(requireActivity()).d(new File(requireActivity().getFilesDir(), this.B)).B((AppCompatImageView) _$_findCachedViewById(R.id.monetizationSchemeButtonImage));
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.E, e10);
        }
    }
}
