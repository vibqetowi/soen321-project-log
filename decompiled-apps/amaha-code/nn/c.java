package nn;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.CenterZoomLayoutManager;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ACB1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lnn/c;", "Lrn/b;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c extends rn.b {
    public static final /* synthetic */ int C = 0;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f26440w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26441x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f26442y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public String f26443z = "#465a62";
    public final String A = LogHelper.INSTANCE.makeLogTag(c.class);

    /* compiled from: ACB1Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.e<C0433a> {

        /* renamed from: x  reason: collision with root package name */
        public final Activity f26444x;

        /* renamed from: y  reason: collision with root package name */
        public final ArrayList<String> f26445y;

        /* renamed from: z  reason: collision with root package name */
        public final LayoutInflater f26446z;

        /* compiled from: ACB1Fragment.kt */
        /* renamed from: nn.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0433a extends RecyclerView.c0 {

            /* renamed from: u  reason: collision with root package name */
            public final AppCompatImageView f26447u;

            public C0433a(View view) {
                super(view);
                this.f26447u = (AppCompatImageView) view.findViewById(R.id.acb1Image);
            }
        }

        public a(androidx.fragment.app.p pVar, ArrayList imageList) {
            kotlin.jvm.internal.i.g(imageList, "imageList");
            this.f26444x = pVar;
            this.f26445y = imageList;
            Object systemService = pVar.getSystemService("layout_inflater");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            this.f26446z = (LayoutInflater) systemService;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            return this.f26445y.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void n(C0433a c0433a, int i6) {
            C0433a c0433a2 = c0433a;
            Activity activity = this.f26444x;
            try {
                String str = (String) is.u.j2(i6, this.f26445y);
                if (str != null) {
                    Glide.f(activity).d(new File(activity.getFilesDir(), str)).B(c0433a2.f26447u);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e("ACB1Adapter", e10);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.c0 p(int i6, RecyclerView parent) {
            kotlin.jvm.internal.i.g(parent, "parent");
            View inflate = this.f26446z.inflate(R.layout.row_acb1, (ViewGroup) parent, false);
            kotlin.jvm.internal.i.f(inflate, "inflater.inflate(R.layout.row_acb1, parent, false)");
            return new C0433a(inflate);
        }
    }

    /* compiled from: ACB1Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i6, RecyclerView recyclerView) {
            boolean z10;
            RecyclerView.c0 L;
            kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
            if (i6 == 0) {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.i.e(layoutManager, "null cannot be cast to non-null type com.theinnerhour.b2b.utils.CenterZoomLayoutManager");
                int childCount = ((CenterZoomLayoutManager) layoutManager).getChildCount();
                float f = -1.0f;
                View view = null;
                for (int i10 = 0; i10 < childCount; i10++) {
                    RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
                    kotlin.jvm.internal.i.e(layoutManager2, "null cannot be cast to non-null type com.theinnerhour.b2b.utils.CenterZoomLayoutManager");
                    View childAt = ((CenterZoomLayoutManager) layoutManager2).getChildAt(i10);
                    kotlin.jvm.internal.i.d(childAt);
                    float scaleY = childAt.getScaleY();
                    if (scaleY > f) {
                        RecyclerView.m layoutManager3 = recyclerView.getLayoutManager();
                        kotlin.jvm.internal.i.e(layoutManager3, "null cannot be cast to non-null type com.theinnerhour.b2b.utils.CenterZoomLayoutManager");
                        view = ((CenterZoomLayoutManager) layoutManager3).getChildAt(i10);
                        kotlin.jvm.internal.i.d(view);
                        f = scaleY;
                    }
                }
                int i11 = -1;
                if (view != null && (L = RecyclerView.L(view)) != null) {
                    i11 = L.e();
                }
                int i12 = c.C;
                c cVar = c.this;
                cVar.getClass();
                try {
                    int childCount2 = ((LinearLayout) cVar._$_findCachedViewById(R.id.acb1PositionContainer)).getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        if (i13 == i11) {
                            if (cVar.f26443z.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                ((LinearLayout) cVar._$_findCachedViewById(R.id.acb1PositionContainer)).getChildAt(i13).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(cVar.f26443z)));
                            }
                        } else {
                            ((LinearLayout) cVar._$_findCachedViewById(R.id.acb1PositionContainer)).getChildAt(i13).setBackgroundTintList(null);
                        }
                    }
                    String str = (String) is.u.j2(i11, cVar.f26441x);
                    if (str != null) {
                        ((RobertoTextView) cVar._$_findCachedViewById(R.id.acb1FooterTitle)).setText(str);
                    }
                    String str2 = (String) is.u.j2(i11, cVar.f26442y);
                    if (str2 != null) {
                        ((RobertoTextView) cVar._$_findCachedViewById(R.id.acb1FooterSubtitle)).setText(str2);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(cVar.A, e10);
                }
            }
        }
    }

    public final void I(int i6) {
        try {
            if (getActivity() != null) {
                for (int i10 = 0; i10 < i6; i10++) {
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    View inflate = activity.getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.acb1PositionContainer)), false);
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    Object obj = g0.a.f16164a;
                    inflate.setBackground(a.c.b(activity2, R.drawable.circle_filled_grey));
                    ((LinearLayout) _$_findCachedViewById(R.id.acb1PositionContainer)).addView(inflate);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:43:0x0064, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x008e, B:58:0x0096, B:67:0x00a6, B:68:0x00a8, B:70:0x00b0, B:79:0x00c0, B:80:0x00c2, B:82:0x00ca, B:88:0x00d6), top: B:93:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047 A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:43:0x0064, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x008e, B:58:0x0096, B:67:0x00a6, B:68:0x00a8, B:70:0x00b0, B:79:0x00c0, B:80:0x00c2, B:82:0x00ca, B:88:0x00d6), top: B:93:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051 A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:43:0x0064, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x008e, B:58:0x0096, B:67:0x00a6, B:68:0x00a8, B:70:0x00b0, B:79:0x00c0, B:80:0x00c2, B:82:0x00ca, B:88:0x00d6), top: B:93:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:43:0x0064, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x008e, B:58:0x0096, B:67:0x00a6, B:68:0x00a8, B:70:0x00b0, B:79:0x00c0, B:80:0x00c2, B:82:0x00ca, B:88:0x00d6), top: B:93:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:43:0x0064, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x008e, B:58:0x0096, B:67:0x00a6, B:68:0x00a8, B:70:0x00b0, B:79:0x00c0, B:80:0x00c2, B:82:0x00ca, B:88:0x00d6), top: B:93:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0085 A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:43:0x0064, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x008e, B:58:0x0096, B:67:0x00a6, B:68:0x00a8, B:70:0x00b0, B:79:0x00c0, B:80:0x00c2, B:82:0x00ca, B:88:0x00d6), top: B:93:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096 A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:43:0x0064, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x008e, B:58:0x0096, B:67:0x00a6, B:68:0x00a8, B:70:0x00b0, B:79:0x00c0, B:80:0x00c2, B:82:0x00ca, B:88:0x00d6), top: B:93:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a6 A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:43:0x0064, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x008e, B:58:0x0096, B:67:0x00a6, B:68:0x00a8, B:70:0x00b0, B:79:0x00c0, B:80:0x00c2, B:82:0x00ca, B:88:0x00d6), top: B:93:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b0 A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:43:0x0064, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x008e, B:58:0x0096, B:67:0x00a6, B:68:0x00a8, B:70:0x00b0, B:79:0x00c0, B:80:0x00c2, B:82:0x00ca, B:88:0x00d6), top: B:93:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c0 A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:43:0x0064, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x008e, B:58:0x0096, B:67:0x00a6, B:68:0x00a8, B:70:0x00b0, B:79:0x00c0, B:80:0x00c2, B:82:0x00ca, B:88:0x00d6), top: B:93:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ca A[Catch: Exception -> 0x0121, TryCatch #0 {Exception -> 0x0121, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:43:0x0064, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x008e, B:58:0x0096, B:67:0x00a6, B:68:0x00a8, B:70:0x00b0, B:79:0x00c0, B:80:0x00c2, B:82:0x00ca, B:88:0x00d6), top: B:93:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d6 A[Catch: Exception -> 0x0121, TRY_LEAVE, TryCatch #0 {Exception -> 0x0121, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0049, B:33:0x0051, B:43:0x0064, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x008e, B:58:0x0096, B:67:0x00a6, B:68:0x00a8, B:70:0x00b0, B:79:0x00c0, B:80:0x00c2, B:82:0x00ca, B:88:0x00d6), top: B:93:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
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
        ArrayList<String> stringArrayList;
        boolean z13;
        ArrayList<String> stringArrayList2;
        boolean z14;
        ArrayList<String> stringArrayList3;
        boolean z15;
        String string3;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string4 = arguments.getString("acb1_title", "");
                boolean z16 = false;
                if (string4 != null && string4.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string4 = null;
                    }
                    if (string4 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.acb1Title)).setText(string4);
                    }
                    string = arguments.getString("acb1_dot_color", "");
                    if (string != null && string.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            string = null;
                        }
                        if (string != null) {
                            this.f26443z = string;
                        }
                        string2 = arguments.getString("acb1_desc", "");
                        if (string2 != null && string2.length() != 0) {
                            z12 = false;
                            if (!z12) {
                                string2 = null;
                            }
                            if (string2 != null) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.acb1Subtitle)).setText(string2);
                            }
                            stringArrayList = arguments.getStringArrayList("acb1_icon_list");
                            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                                z13 = false;
                                if (!z13) {
                                    stringArrayList = null;
                                }
                                if (stringArrayList != null) {
                                    this.f26440w = stringArrayList;
                                    I(stringArrayList.size());
                                }
                                stringArrayList2 = arguments.getStringArrayList("acb1_title_list");
                                if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                                    z14 = false;
                                    if (!z14) {
                                        stringArrayList2 = null;
                                    }
                                    if (stringArrayList2 != null) {
                                        this.f26441x = stringArrayList2;
                                    }
                                    stringArrayList3 = arguments.getStringArrayList("acb1_desc_list");
                                    if (stringArrayList3 != null && !stringArrayList3.isEmpty()) {
                                        z15 = false;
                                        if (!z15) {
                                            stringArrayList3 = null;
                                        }
                                        if (stringArrayList3 != null) {
                                            this.f26442y = stringArrayList3;
                                        }
                                        string3 = arguments.getString("template_colour", "");
                                        if (!((string3 != null || string3.length() == 0) ? true : true)) {
                                            str = string3;
                                        }
                                        if (str == null) {
                                            ((RobertoTextView) _$_findCachedViewById(R.id.acb1Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                            ((RobertoTextView) _$_findCachedViewById(R.id.acb1Subtitle)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                            ((RobertoTextView) _$_findCachedViewById(R.id.acb1FooterTitle)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                            ((RobertoTextView) _$_findCachedViewById(R.id.acb1FooterSubtitle)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                            return;
                                        }
                                        return;
                                    }
                                    z15 = true;
                                    if (!z15) {
                                    }
                                    if (stringArrayList3 != null) {
                                    }
                                    string3 = arguments.getString("template_colour", "");
                                    if (!((string3 != null || string3.length() == 0) ? true : true)) {
                                    }
                                    if (str == null) {
                                    }
                                }
                                z14 = true;
                                if (!z14) {
                                }
                                if (stringArrayList2 != null) {
                                }
                                stringArrayList3 = arguments.getStringArrayList("acb1_desc_list");
                                if (stringArrayList3 != null) {
                                    z15 = false;
                                    if (!z15) {
                                    }
                                    if (stringArrayList3 != null) {
                                    }
                                    string3 = arguments.getString("template_colour", "");
                                    if (!((string3 != null || string3.length() == 0) ? true : true)) {
                                    }
                                    if (str == null) {
                                    }
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (stringArrayList3 != null) {
                                }
                                string3 = arguments.getString("template_colour", "");
                                if (!((string3 != null || string3.length() == 0) ? true : true)) {
                                }
                                if (str == null) {
                                }
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (stringArrayList != null) {
                            }
                            stringArrayList2 = arguments.getStringArrayList("acb1_title_list");
                            if (stringArrayList2 != null) {
                                z14 = false;
                                if (!z14) {
                                }
                                if (stringArrayList2 != null) {
                                }
                                stringArrayList3 = arguments.getStringArrayList("acb1_desc_list");
                                if (stringArrayList3 != null) {
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (stringArrayList3 != null) {
                                }
                                string3 = arguments.getString("template_colour", "");
                                if (!((string3 != null || string3.length() == 0) ? true : true)) {
                                }
                                if (str == null) {
                                }
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (stringArrayList2 != null) {
                            }
                            stringArrayList3 = arguments.getStringArrayList("acb1_desc_list");
                            if (stringArrayList3 != null) {
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            if (stringArrayList3 != null) {
                            }
                            string3 = arguments.getString("template_colour", "");
                            if (!((string3 != null || string3.length() == 0) ? true : true)) {
                            }
                            if (str == null) {
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        if (string2 != null) {
                        }
                        stringArrayList = arguments.getStringArrayList("acb1_icon_list");
                        if (stringArrayList != null) {
                            z13 = false;
                            if (!z13) {
                            }
                            if (stringArrayList != null) {
                            }
                            stringArrayList2 = arguments.getStringArrayList("acb1_title_list");
                            if (stringArrayList2 != null) {
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (stringArrayList2 != null) {
                            }
                            stringArrayList3 = arguments.getStringArrayList("acb1_desc_list");
                            if (stringArrayList3 != null) {
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            if (stringArrayList3 != null) {
                            }
                            string3 = arguments.getString("template_colour", "");
                            if (!((string3 != null || string3.length() == 0) ? true : true)) {
                            }
                            if (str == null) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (stringArrayList != null) {
                        }
                        stringArrayList2 = arguments.getStringArrayList("acb1_title_list");
                        if (stringArrayList2 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        stringArrayList3 = arguments.getStringArrayList("acb1_desc_list");
                        if (stringArrayList3 != null) {
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        if (stringArrayList3 != null) {
                        }
                        string3 = arguments.getString("template_colour", "");
                        if (!((string3 != null || string3.length() == 0) ? true : true)) {
                        }
                        if (str == null) {
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    string2 = arguments.getString("acb1_desc", "");
                    if (string2 != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (string2 != null) {
                        }
                        stringArrayList = arguments.getStringArrayList("acb1_icon_list");
                        if (stringArrayList != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (stringArrayList != null) {
                        }
                        stringArrayList2 = arguments.getStringArrayList("acb1_title_list");
                        if (stringArrayList2 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        stringArrayList3 = arguments.getStringArrayList("acb1_desc_list");
                        if (stringArrayList3 != null) {
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        if (stringArrayList3 != null) {
                        }
                        string3 = arguments.getString("template_colour", "");
                        if (!((string3 != null || string3.length() == 0) ? true : true)) {
                        }
                        if (str == null) {
                        }
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (string2 != null) {
                    }
                    stringArrayList = arguments.getStringArrayList("acb1_icon_list");
                    if (stringArrayList != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("acb1_title_list");
                    if (stringArrayList2 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    stringArrayList3 = arguments.getStringArrayList("acb1_desc_list");
                    if (stringArrayList3 != null) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (stringArrayList3 != null) {
                    }
                    string3 = arguments.getString("template_colour", "");
                    if (!((string3 != null || string3.length() == 0) ? true : true)) {
                    }
                    if (str == null) {
                    }
                }
                z10 = true;
                str = null;
                if (!z10) {
                }
                if (string4 != null) {
                }
                string = arguments.getString("acb1_dot_color", "");
                if (string != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    string2 = arguments.getString("acb1_desc", "");
                    if (string2 != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (string2 != null) {
                    }
                    stringArrayList = arguments.getStringArrayList("acb1_icon_list");
                    if (stringArrayList != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("acb1_title_list");
                    if (stringArrayList2 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    stringArrayList3 = arguments.getStringArrayList("acb1_desc_list");
                    if (stringArrayList3 != null) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (stringArrayList3 != null) {
                    }
                    string3 = arguments.getString("template_colour", "");
                    if (!((string3 != null || string3.length() == 0) ? true : true)) {
                    }
                    if (str == null) {
                    }
                }
                z11 = true;
                if (!z11) {
                }
                if (string != null) {
                }
                string2 = arguments.getString("acb1_desc", "");
                if (string2 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (string2 != null) {
                }
                stringArrayList = arguments.getStringArrayList("acb1_icon_list");
                if (stringArrayList != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (stringArrayList != null) {
                }
                stringArrayList2 = arguments.getStringArrayList("acb1_title_list");
                if (stringArrayList2 != null) {
                }
                z14 = true;
                if (!z14) {
                }
                if (stringArrayList2 != null) {
                }
                stringArrayList3 = arguments.getStringArrayList("acb1_desc_list");
                if (stringArrayList3 != null) {
                }
                z15 = true;
                if (!z15) {
                }
                if (stringArrayList3 != null) {
                }
                string3 = arguments.getString("template_colour", "");
                if (!((string3 != null || string3.length() == 0) ? true : true)) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.B.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
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
        return inflater.inflate(R.layout.fragment_acb1, viewGroup, false);
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
            ((RecyclerView) _$_findCachedViewById(R.id.acb1Recycler)).setLayoutManager(new CenterZoomLayoutManager(getActivity(), 0, false, 0.01f, 0.0f, null, 48, null));
            androidx.fragment.app.p it = requireActivity();
            kotlin.jvm.internal.i.f(it, "it");
            ((RecyclerView) _$_findCachedViewById(R.id.acb1Recycler)).setAdapter(new a(it, this.f26440w));
            new androidx.recyclerview.widget.w().a((RecyclerView) _$_findCachedViewById(R.id.acb1Recycler));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.acb1Recycler);
            if (recyclerView != null) {
                recyclerView.post(new tl.o(8, this));
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }
}
