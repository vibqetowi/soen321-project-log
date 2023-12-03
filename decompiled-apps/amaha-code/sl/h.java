package sl;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkResponseModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.k;
import is.u;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import ss.l;
import tl.j;
/* compiled from: ExpertToolsAdapter.kt */
/* loaded from: classes2.dex */
public final class h extends RecyclerView.e<RecyclerView.c0> {
    public final int A;
    public final ZoneOffset B;
    public zl.a C;
    public List<vl.f> D;
    public final String E;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<vl.f> f31671x;

    /* renamed from: y  reason: collision with root package name */
    public final l<vl.f, k> f31672y;

    /* renamed from: z  reason: collision with root package name */
    public final int f31673z;

    /* compiled from: ExpertToolsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    /* compiled from: ExpertToolsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.c0 {
        public b(View view) {
            super(view);
        }
    }

    public h(Context context, ArrayList toolList, j jVar) {
        i.g(toolList, "toolList");
        this.f31671x = toolList;
        this.f31672y = jVar;
        this.f31673z = 1;
        this.A = 2;
        this.B = ZoneId.systemDefault().getRules().getOffset(Instant.now());
        this.C = zl.a.ALL;
        this.D = this.f31671x;
        this.E = LogHelper.INSTANCE.makeLogTag("ExpertToolsAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.D.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        int i10 = this.f31673z;
        try {
            int i11 = this.D.get(i6).f35270a;
            if (i11 == 6 || i11 == 1 || i11 == 0) {
                return this.A;
            }
            return i10;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.E, e10);
            return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0116, code lost:
        if (r1.f35271b != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114 A[Catch: Exception -> 0x0153, TRY_LEAVE, TryCatch #0 {Exception -> 0x0153, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x0036, B:8:0x005f, B:47:0x0146, B:7:0x004b, B:9:0x0078, B:11:0x0087, B:13:0x008d, B:15:0x0098, B:20:0x00be, B:25:0x00c8, B:27:0x00d2, B:29:0x00d8, B:31:0x00de, B:33:0x0108, B:35:0x0114, B:43:0x0125, B:45:0x0133, B:46:0x0137, B:32:0x00ec), top: B:52:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133 A[Catch: Exception -> 0x0153, TryCatch #0 {Exception -> 0x0153, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x0036, B:8:0x005f, B:47:0x0146, B:7:0x004b, B:9:0x0078, B:11:0x0087, B:13:0x008d, B:15:0x0098, B:20:0x00be, B:25:0x00c8, B:27:0x00d2, B:29:0x00d8, B:31:0x00de, B:33:0x0108, B:35:0x0114, B:43:0x0125, B:45:0x0133, B:46:0x0137, B:32:0x00ec), top: B:52:0x0000 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(RecyclerView.c0 c0Var, int i6) {
        long j10;
        String str;
        String str2;
        TelecommunicationsHomeworkResponseModel.ToolContent toolContent;
        Long epochSortKey;
        try {
            boolean z10 = false;
            if (h(i6) == this.f31673z) {
                View view = ((a) c0Var).f2751a;
                if (is.k.Q1(Integer.valueOf(this.D.get(i6).f35270a), new Integer[]{2, 4})) {
                    ((RobertoTextView) view.findViewById(R.id.tvDescription)).setText(view.getContext().getString(R.string.expert_care_first_session_tips_body));
                } else {
                    ((RobertoTextView) view.findViewById(R.id.tvDescription)).setText(view.getContext().getString(R.string.expert_care_first_session_prepare_body));
                }
                ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.expert_tool_intro_title));
            } else {
                b bVar = (b) c0Var;
                vl.f fVar = this.D.get(i6);
                TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel = fVar.f35272c;
                if (homeworkModel != null && (epochSortKey = homeworkModel.getEpochSortKey()) != null) {
                    j10 = epochSortKey.longValue() / 1000;
                } else {
                    j10 = 0;
                }
                String format = LocalDateTime.ofEpochSecond(j10, 0, this.B).format(DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.ENGLISH));
                View view2 = bVar.f2751a;
                String str3 = null;
                int i10 = fVar.f35270a;
                TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel2 = fVar.f35272c;
                if (i10 != 0 && i10 != 1) {
                    if (homeworkModel2 != null && !homeworkModel2.isBSETool()) {
                        z10 = true;
                    }
                    if (!z10) {
                        com.bumptech.glide.f g5 = Glide.g(view2.getContext());
                        if (homeworkModel2 != null && (toolContent = homeworkModel2.getToolContent()) != null) {
                            str2 = toolContent.getToolAsset();
                        } else {
                            str2 = null;
                        }
                        g5.p(str2).B((AppCompatImageView) view2.findViewById(R.id.ivTool));
                        RobertoTextView robertoTextView = (RobertoTextView) view2.findViewById(R.id.tvToolAssignedTitle);
                        if (i10 == 6) {
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    str = "";
                                }
                                str = "Assigned By Psychiatrist";
                            }
                            str = "Assigned By Therapist";
                        }
                        robertoTextView.setText(str);
                        RobertoTextView robertoTextView2 = (RobertoTextView) view2.findViewById(R.id.tvToolName);
                        if (homeworkModel2 != null) {
                            str3 = homeworkModel2.getName();
                        }
                        robertoTextView2.setText(str3);
                        ((RobertoTextView) view2.findViewById(R.id.tvToolDate)).setText(format);
                    }
                }
                Glide.g(view2.getContext()).o(Integer.valueOf((int) R.drawable.ic_pro_db_assessment_light)).B((AppCompatImageView) view2.findViewById(R.id.ivTool));
                RobertoTextView robertoTextView3 = (RobertoTextView) view2.findViewById(R.id.tvToolAssignedTitle);
                if (i10 == 6) {
                }
                robertoTextView3.setText(str);
                RobertoTextView robertoTextView22 = (RobertoTextView) view2.findViewById(R.id.tvToolName);
                if (homeworkModel2 != null) {
                }
                robertoTextView22.setText(str3);
                ((RobertoTextView) view2.findViewById(R.id.tvToolDate)).setText(format);
            }
            c0Var.f2751a.setOnClickListener(new ak.d(i6, 9, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.E, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (i6 == this.f31673z) {
            View view = defpackage.d.d(parent, R.layout.layout_expert_tools_into, parent, false);
            i.f(view, "view");
            return new a(view);
        }
        View view2 = defpackage.d.d(parent, R.layout.layout_expert_tools, parent, false);
        i.f(view2, "view");
        return new b(view2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r1.add(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        boolean z10;
        try {
            ArrayList<vl.f> arrayList = this.f31671x;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                vl.f fVar = (vl.f) next;
                int ordinal = this.C.ordinal();
                if (ordinal != 0) {
                    z10 = false;
                    if (ordinal != 1) {
                        if (ordinal != 2 && ordinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!fVar.f35271b) {
                        z10 = true;
                    }
                } else {
                    z10 = fVar.f35271b;
                }
            }
            this.D = u.E2(arrayList2, 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.E, e10);
        }
    }

    public final int w(ArrayList<vl.f> newToolsList) {
        i.g(newToolsList, "newToolsList");
        try {
            this.f31671x = newToolsList;
            v();
            i();
            return this.D.size();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.E, e10);
            return 0;
        }
    }
}
