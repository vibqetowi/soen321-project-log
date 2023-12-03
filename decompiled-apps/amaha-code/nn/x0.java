package nn;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DBC1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/x0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class x0 extends Fragment {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f26651w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f26653v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f26652u = LogHelper.INSTANCE.makeLogTag(x0.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26653v;
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
        return inflater.inflate(R.layout.fragment_dbc1, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f26653v.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0149 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0155 A[Catch: Exception -> 0x0167, TRY_LEAVE, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0124 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x001a, B:18:0x002e, B:19:0x0037, B:21:0x003f, B:30:0x004f, B:31:0x005c, B:33:0x0064, B:43:0x0077, B:44:0x0080, B:46:0x0088, B:55:0x0098, B:56:0x00a5, B:58:0x00ad, B:64:0x00b9, B:73:0x00c9, B:74:0x00f8, B:76:0x0100, B:86:0x0113, B:87:0x011c, B:89:0x0124, B:98:0x0134, B:99:0x0141, B:101:0x0149, B:107:0x0155), top: B:113:0x000b }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
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
        boolean z15;
        String string5;
        boolean z16;
        String string6;
        boolean z17;
        String string7;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string8 = arguments.getString("dbc1_title", "");
                boolean z18 = false;
                if (string8 != null && string8.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string8 = null;
                    }
                    if (string8 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.dbc1Header)).setText(string8);
                    }
                    string = arguments.getString("dbc1_title_color", "");
                    if (string != null && string.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            string = null;
                        }
                        if (string != null) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.dbc1Header)).setTextColor(Color.parseColor(string));
                        }
                        string2 = arguments.getString("dbc1_description", "");
                        if (string2 != null && string2.length() != 0) {
                            z12 = false;
                            if (!z12) {
                                string2 = null;
                            }
                            if (string2 != null) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.dbc1Subheader)).setText(string2);
                            }
                            string3 = arguments.getString("dbc1_description_color", "");
                            if (string3 != null && string3.length() != 0) {
                                z13 = false;
                                if (!z13) {
                                    string3 = null;
                                }
                                if (string3 != null) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.dbc1Subheader)).setTextColor(Color.parseColor(string3));
                                }
                                string4 = arguments.getString("dbc1_image", "");
                                if (string4 != null && string4.length() != 0) {
                                    z14 = false;
                                    if (!z14 && getActivity() != null) {
                                        z15 = false;
                                        if (!z15) {
                                            string4 = null;
                                        }
                                        if (string4 != null) {
                                            androidx.fragment.app.p activity = getActivity();
                                            kotlin.jvm.internal.i.d(activity);
                                            com.bumptech.glide.f d10 = Glide.c(activity).d(activity);
                                            androidx.fragment.app.p activity2 = getActivity();
                                            kotlin.jvm.internal.i.d(activity2);
                                            d10.d(new File(activity2.getFilesDir(), string4)).B((AppCompatImageView) _$_findCachedViewById(R.id.dbc1Image));
                                        }
                                        string5 = arguments.getString("dbc1_cta", "");
                                        if (string5 != null && string5.length() != 0) {
                                            z16 = false;
                                            if (!z16) {
                                                string5 = null;
                                            }
                                            if (string5 != null) {
                                                ((RobertoTextView) _$_findCachedViewById(R.id.dbc1Cta)).setText(string5);
                                            }
                                            string6 = arguments.getString("dbc1_cta_text_color", "");
                                            if (string6 != null && string6.length() != 0) {
                                                z17 = false;
                                                if (!z17) {
                                                    string6 = null;
                                                }
                                                if (string6 != null) {
                                                    ((RobertoTextView) _$_findCachedViewById(R.id.dbc1Cta)).setTextColor(Color.parseColor(string6));
                                                }
                                                string7 = arguments.getString("dbc1_cta_bg_color", "");
                                                if (!((string7 != null || string7.length() == 0) ? true : true)) {
                                                    str = string7;
                                                }
                                                if (str != null) {
                                                    ((RobertoTextView) _$_findCachedViewById(R.id.dbc1Cta)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str)));
                                                }
                                            }
                                            z17 = true;
                                            if (!z17) {
                                            }
                                            if (string6 != null) {
                                            }
                                            string7 = arguments.getString("dbc1_cta_bg_color", "");
                                            if (!((string7 != null || string7.length() == 0) ? true : true)) {
                                            }
                                            if (str != null) {
                                            }
                                        }
                                        z16 = true;
                                        if (!z16) {
                                        }
                                        if (string5 != null) {
                                        }
                                        string6 = arguments.getString("dbc1_cta_text_color", "");
                                        if (string6 != null) {
                                            z17 = false;
                                            if (!z17) {
                                            }
                                            if (string6 != null) {
                                            }
                                            string7 = arguments.getString("dbc1_cta_bg_color", "");
                                            if (!((string7 != null || string7.length() == 0) ? true : true)) {
                                            }
                                            if (str != null) {
                                            }
                                        }
                                        z17 = true;
                                        if (!z17) {
                                        }
                                        if (string6 != null) {
                                        }
                                        string7 = arguments.getString("dbc1_cta_bg_color", "");
                                        if (!((string7 != null || string7.length() == 0) ? true : true)) {
                                        }
                                        if (str != null) {
                                        }
                                    }
                                    z15 = true;
                                    if (!z15) {
                                    }
                                    if (string4 != null) {
                                    }
                                    string5 = arguments.getString("dbc1_cta", "");
                                    if (string5 != null) {
                                        z16 = false;
                                        if (!z16) {
                                        }
                                        if (string5 != null) {
                                        }
                                        string6 = arguments.getString("dbc1_cta_text_color", "");
                                        if (string6 != null) {
                                        }
                                        z17 = true;
                                        if (!z17) {
                                        }
                                        if (string6 != null) {
                                        }
                                        string7 = arguments.getString("dbc1_cta_bg_color", "");
                                        if (!((string7 != null || string7.length() == 0) ? true : true)) {
                                        }
                                        if (str != null) {
                                        }
                                    }
                                    z16 = true;
                                    if (!z16) {
                                    }
                                    if (string5 != null) {
                                    }
                                    string6 = arguments.getString("dbc1_cta_text_color", "");
                                    if (string6 != null) {
                                    }
                                    z17 = true;
                                    if (!z17) {
                                    }
                                    if (string6 != null) {
                                    }
                                    string7 = arguments.getString("dbc1_cta_bg_color", "");
                                    if (!((string7 != null || string7.length() == 0) ? true : true)) {
                                    }
                                    if (str != null) {
                                    }
                                }
                                z14 = true;
                                if (!z14) {
                                    z15 = false;
                                    if (!z15) {
                                    }
                                    if (string4 != null) {
                                    }
                                    string5 = arguments.getString("dbc1_cta", "");
                                    if (string5 != null) {
                                    }
                                    z16 = true;
                                    if (!z16) {
                                    }
                                    if (string5 != null) {
                                    }
                                    string6 = arguments.getString("dbc1_cta_text_color", "");
                                    if (string6 != null) {
                                    }
                                    z17 = true;
                                    if (!z17) {
                                    }
                                    if (string6 != null) {
                                    }
                                    string7 = arguments.getString("dbc1_cta_bg_color", "");
                                    if (!((string7 != null || string7.length() == 0) ? true : true)) {
                                    }
                                    if (str != null) {
                                    }
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (string4 != null) {
                                }
                                string5 = arguments.getString("dbc1_cta", "");
                                if (string5 != null) {
                                }
                                z16 = true;
                                if (!z16) {
                                }
                                if (string5 != null) {
                                }
                                string6 = arguments.getString("dbc1_cta_text_color", "");
                                if (string6 != null) {
                                }
                                z17 = true;
                                if (!z17) {
                                }
                                if (string6 != null) {
                                }
                                string7 = arguments.getString("dbc1_cta_bg_color", "");
                                if (!((string7 != null || string7.length() == 0) ? true : true)) {
                                }
                                if (str != null) {
                                }
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (string3 != null) {
                            }
                            string4 = arguments.getString("dbc1_image", "");
                            if (string4 != null) {
                                z14 = false;
                                if (!z14) {
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (string4 != null) {
                                }
                                string5 = arguments.getString("dbc1_cta", "");
                                if (string5 != null) {
                                }
                                z16 = true;
                                if (!z16) {
                                }
                                if (string5 != null) {
                                }
                                string6 = arguments.getString("dbc1_cta_text_color", "");
                                if (string6 != null) {
                                }
                                z17 = true;
                                if (!z17) {
                                }
                                if (string6 != null) {
                                }
                                string7 = arguments.getString("dbc1_cta_bg_color", "");
                                if (!((string7 != null || string7.length() == 0) ? true : true)) {
                                }
                                if (str != null) {
                                }
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            if (string4 != null) {
                            }
                            string5 = arguments.getString("dbc1_cta", "");
                            if (string5 != null) {
                            }
                            z16 = true;
                            if (!z16) {
                            }
                            if (string5 != null) {
                            }
                            string6 = arguments.getString("dbc1_cta_text_color", "");
                            if (string6 != null) {
                            }
                            z17 = true;
                            if (!z17) {
                            }
                            if (string6 != null) {
                            }
                            string7 = arguments.getString("dbc1_cta_bg_color", "");
                            if (!((string7 != null || string7.length() == 0) ? true : true)) {
                            }
                            if (str != null) {
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        if (string2 != null) {
                        }
                        string3 = arguments.getString("dbc1_description_color", "");
                        if (string3 != null) {
                            z13 = false;
                            if (!z13) {
                            }
                            if (string3 != null) {
                            }
                            string4 = arguments.getString("dbc1_image", "");
                            if (string4 != null) {
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            if (string4 != null) {
                            }
                            string5 = arguments.getString("dbc1_cta", "");
                            if (string5 != null) {
                            }
                            z16 = true;
                            if (!z16) {
                            }
                            if (string5 != null) {
                            }
                            string6 = arguments.getString("dbc1_cta_text_color", "");
                            if (string6 != null) {
                            }
                            z17 = true;
                            if (!z17) {
                            }
                            if (string6 != null) {
                            }
                            string7 = arguments.getString("dbc1_cta_bg_color", "");
                            if (!((string7 != null || string7.length() == 0) ? true : true)) {
                            }
                            if (str != null) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (string3 != null) {
                        }
                        string4 = arguments.getString("dbc1_image", "");
                        if (string4 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        if (string4 != null) {
                        }
                        string5 = arguments.getString("dbc1_cta", "");
                        if (string5 != null) {
                        }
                        z16 = true;
                        if (!z16) {
                        }
                        if (string5 != null) {
                        }
                        string6 = arguments.getString("dbc1_cta_text_color", "");
                        if (string6 != null) {
                        }
                        z17 = true;
                        if (!z17) {
                        }
                        if (string6 != null) {
                        }
                        string7 = arguments.getString("dbc1_cta_bg_color", "");
                        if (!((string7 != null || string7.length() == 0) ? true : true)) {
                        }
                        if (str != null) {
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    string2 = arguments.getString("dbc1_description", "");
                    if (string2 != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (string2 != null) {
                        }
                        string3 = arguments.getString("dbc1_description_color", "");
                        if (string3 != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (string3 != null) {
                        }
                        string4 = arguments.getString("dbc1_image", "");
                        if (string4 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        if (string4 != null) {
                        }
                        string5 = arguments.getString("dbc1_cta", "");
                        if (string5 != null) {
                        }
                        z16 = true;
                        if (!z16) {
                        }
                        if (string5 != null) {
                        }
                        string6 = arguments.getString("dbc1_cta_text_color", "");
                        if (string6 != null) {
                        }
                        z17 = true;
                        if (!z17) {
                        }
                        if (string6 != null) {
                        }
                        string7 = arguments.getString("dbc1_cta_bg_color", "");
                        if (!((string7 != null || string7.length() == 0) ? true : true)) {
                        }
                        if (str != null) {
                        }
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (string2 != null) {
                    }
                    string3 = arguments.getString("dbc1_description_color", "");
                    if (string3 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (string3 != null) {
                    }
                    string4 = arguments.getString("dbc1_image", "");
                    if (string4 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (string4 != null) {
                    }
                    string5 = arguments.getString("dbc1_cta", "");
                    if (string5 != null) {
                    }
                    z16 = true;
                    if (!z16) {
                    }
                    if (string5 != null) {
                    }
                    string6 = arguments.getString("dbc1_cta_text_color", "");
                    if (string6 != null) {
                    }
                    z17 = true;
                    if (!z17) {
                    }
                    if (string6 != null) {
                    }
                    string7 = arguments.getString("dbc1_cta_bg_color", "");
                    if (!((string7 != null || string7.length() == 0) ? true : true)) {
                    }
                    if (str != null) {
                    }
                }
                z10 = true;
                str = null;
                if (!z10) {
                }
                if (string8 != null) {
                }
                string = arguments.getString("dbc1_title_color", "");
                if (string != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    string2 = arguments.getString("dbc1_description", "");
                    if (string2 != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (string2 != null) {
                    }
                    string3 = arguments.getString("dbc1_description_color", "");
                    if (string3 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (string3 != null) {
                    }
                    string4 = arguments.getString("dbc1_image", "");
                    if (string4 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (string4 != null) {
                    }
                    string5 = arguments.getString("dbc1_cta", "");
                    if (string5 != null) {
                    }
                    z16 = true;
                    if (!z16) {
                    }
                    if (string5 != null) {
                    }
                    string6 = arguments.getString("dbc1_cta_text_color", "");
                    if (string6 != null) {
                    }
                    z17 = true;
                    if (!z17) {
                    }
                    if (string6 != null) {
                    }
                    string7 = arguments.getString("dbc1_cta_bg_color", "");
                    if (!((string7 != null || string7.length() == 0) ? true : true)) {
                    }
                    if (str != null) {
                    }
                }
                z11 = true;
                if (!z11) {
                }
                if (string != null) {
                }
                string2 = arguments.getString("dbc1_description", "");
                if (string2 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (string2 != null) {
                }
                string3 = arguments.getString("dbc1_description_color", "");
                if (string3 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (string3 != null) {
                }
                string4 = arguments.getString("dbc1_image", "");
                if (string4 != null) {
                }
                z14 = true;
                if (!z14) {
                }
                z15 = true;
                if (!z15) {
                }
                if (string4 != null) {
                }
                string5 = arguments.getString("dbc1_cta", "");
                if (string5 != null) {
                }
                z16 = true;
                if (!z16) {
                }
                if (string5 != null) {
                }
                string6 = arguments.getString("dbc1_cta_text_color", "");
                if (string6 != null) {
                }
                z17 = true;
                if (!z17) {
                }
                if (string6 != null) {
                }
                string7 = arguments.getString("dbc1_cta_bg_color", "");
                if (!((string7 != null || string7.length() == 0) ? true : true)) {
                }
                if (str != null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26652u, e10);
        }
        ((ConstraintLayout) _$_findCachedViewById(R.id.dbc1Container)).setOnClickListener(new v0(1, this));
    }
}
