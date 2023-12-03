package nn;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: CB15Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lnn/b0;", "Lrn/b;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b0 extends rn.b {
    public static final /* synthetic */ int B = 0;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f26430w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26431x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public String f26432y = "";

    /* renamed from: z  reason: collision with root package name */
    public final String f26433z = LogHelper.INSTANCE.makeLogTag(b0.class);

    /* compiled from: CB15Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.e<C0432a> {
        public final String A;
        public final LayoutInflater B;

        /* renamed from: x  reason: collision with root package name */
        public final Activity f26434x;

        /* renamed from: y  reason: collision with root package name */
        public final ArrayList<String> f26435y;

        /* renamed from: z  reason: collision with root package name */
        public final ArrayList<String> f26436z;

        /* compiled from: CB15Fragment.kt */
        /* renamed from: nn.b0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0432a extends RecyclerView.c0 {

            /* renamed from: u  reason: collision with root package name */
            public final AppCompatImageView f26437u;

            /* renamed from: v  reason: collision with root package name */
            public final RobertoTextView f26438v;

            public C0432a(View view) {
                super(view);
                this.f26437u = (AppCompatImageView) view.findViewById(R.id.cb15Image);
                this.f26438v = (RobertoTextView) view.findViewById(R.id.cb15Title);
            }
        }

        public a(androidx.fragment.app.p pVar, ArrayList imageList, ArrayList titleList, String colour) {
            kotlin.jvm.internal.i.g(imageList, "imageList");
            kotlin.jvm.internal.i.g(titleList, "titleList");
            kotlin.jvm.internal.i.g(colour, "colour");
            this.f26434x = pVar;
            this.f26435y = imageList;
            this.f26436z = titleList;
            this.A = colour;
            Object systemService = pVar.getSystemService("layout_inflater");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            this.B = (LayoutInflater) systemService;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            return this.f26435y.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void n(C0432a c0432a, int i6) {
            C0432a c0432a2 = c0432a;
            Activity activity = this.f26434x;
            try {
                String str = (String) is.u.j2(i6, this.f26435y);
                if (str != null) {
                    Glide.f(activity).d(new File(activity.getFilesDir(), str)).B(c0432a2.f26437u);
                }
                String str2 = (String) is.u.j2(i6, this.f26436z);
                RobertoTextView robertoTextView = c0432a2.f26438v;
                if (str2 != null) {
                    robertoTextView.setText(str2);
                }
                String str3 = this.A;
                if (gv.n.B0(str3)) {
                    str3 = null;
                }
                robertoTextView.setTextColor(ColorStateList.valueOf(Color.parseColor(str3)));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e("CB15Adapter", e10);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.c0 p(int i6, RecyclerView parent) {
            kotlin.jvm.internal.i.g(parent, "parent");
            View inflate = this.B.inflate(R.layout.row_cb15, (ViewGroup) parent, false);
            kotlin.jvm.internal.i.f(inflate, "inflater.inflate(R.layout.row_cb15, parent, false)");
            return new C0432a(inflate);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0085 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008f A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009b A[Catch: Exception -> 0x00c0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c0, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:64:0x009b), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
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
        ArrayList<String> stringArrayList2;
        boolean z13;
        String string2;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string3 = arguments.getString("cb15_title", "");
                boolean z14 = false;
                if (string3 != null && string3.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.cb15Title)).setText(string3);
                    }
                    string = arguments.getString("cb15_desc", "");
                    if (string != null && string.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            string = null;
                        }
                        if (string != null) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.cb15Subtitle)).setText(string);
                        }
                        stringArrayList = arguments.getStringArrayList("cb15_icon_list");
                        if (stringArrayList != null && !stringArrayList.isEmpty()) {
                            z12 = false;
                            if (!z12) {
                                stringArrayList = null;
                            }
                            if (stringArrayList != null) {
                                this.f26430w = stringArrayList;
                            }
                            stringArrayList2 = arguments.getStringArrayList("cb15_icon_title_list");
                            if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                                z13 = false;
                                if (!z13) {
                                    stringArrayList2 = null;
                                }
                                if (stringArrayList2 != null) {
                                    this.f26431x = stringArrayList2;
                                }
                                string2 = arguments.getString("template_colour", "");
                                if (!((string2 != null || string2.length() == 0) ? true : true)) {
                                    str = string2;
                                }
                                if (str == null) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.cb15Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                    ((RobertoTextView) _$_findCachedViewById(R.id.cb15Subtitle)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                    this.f26432y = str;
                                    return;
                                }
                                return;
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (stringArrayList2 != null) {
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
                        stringArrayList2 = arguments.getStringArrayList("cb15_icon_title_list");
                        if (stringArrayList2 != null) {
                            z13 = false;
                            if (!z13) {
                            }
                            if (stringArrayList2 != null) {
                            }
                            string2 = arguments.getString("template_colour", "");
                            if (!((string2 != null || string2.length() == 0) ? true : true)) {
                            }
                            if (str == null) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (stringArrayList2 != null) {
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
                    stringArrayList = arguments.getStringArrayList("cb15_icon_list");
                    if (stringArrayList != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (stringArrayList != null) {
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb15_icon_title_list");
                        if (stringArrayList2 != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (stringArrayList2 != null) {
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
                    stringArrayList2 = arguments.getStringArrayList("cb15_icon_title_list");
                    if (stringArrayList2 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (stringArrayList2 != null) {
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
                string = arguments.getString("cb15_desc", "");
                if (string != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    stringArrayList = arguments.getStringArrayList("cb15_icon_list");
                    if (stringArrayList != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb15_icon_title_list");
                    if (stringArrayList2 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (stringArrayList2 != null) {
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
                stringArrayList = arguments.getStringArrayList("cb15_icon_list");
                if (stringArrayList != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (stringArrayList != null) {
                }
                stringArrayList2 = arguments.getStringArrayList("cb15_icon_title_list");
                if (stringArrayList2 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (stringArrayList2 != null) {
                }
                string2 = arguments.getString("template_colour", "");
                if (!((string2 != null || string2.length() == 0) ? true : true)) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26433z, e10);
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
        return inflater.inflate(R.layout.fragment_cb15, viewGroup, false);
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
            ((RecyclerView) _$_findCachedViewById(R.id.cb15Recycler)).setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
            androidx.fragment.app.p it = requireActivity();
            kotlin.jvm.internal.i.f(it, "it");
            ((RecyclerView) _$_findCachedViewById(R.id.cb15Recycler)).setAdapter(new a(it, this.f26430w, this.f26431x, this.f26432y));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.cb15Recycler);
            if (recyclerView != null) {
                recyclerView.post(new tl.o(9, this));
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26433z, e10);
        }
    }
}
