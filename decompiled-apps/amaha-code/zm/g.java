package zm;

import an.w;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import gv.n;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import pl.w0;
import ss.p;
/* compiled from: LibraryDbResourcesAdapter.kt */
/* loaded from: classes2.dex */
public final class g extends RecyclerView.e<a> {
    public final Context A;
    public final int B;
    public final int C;
    public final int D;

    /* renamed from: x  reason: collision with root package name */
    public final p<LearningHubModel, Boolean, hs.k> f39649x;

    /* renamed from: y  reason: collision with root package name */
    public final String f39650y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<LearningHubModel> f39651z;

    /* compiled from: LibraryDbResourcesAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public g(androidx.fragment.app.p pVar, ArrayList list, w wVar) {
        kotlin.jvm.internal.i.g(list, "list");
        this.f39649x = wVar;
        this.f39650y = LogHelper.INSTANCE.makeLogTag(g.class);
        new ArrayList();
        this.B = 1;
        this.C = 2;
        this.D = 3;
        this.f39651z = list;
        this.A = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f39651z.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r2.equals("Tips") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r2.equals("Therapist says") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r2.equals("Quotes") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        return r1.B;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(int i6) {
        String str;
        LearningHubModel learningHubModel = this.f39651z.get(i6);
        if (learningHubModel != null) {
            str = learningHubModel.getPost_type();
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1864532585:
                    break;
                case -1732810888:
                    if (str.equals("Videos")) {
                        return this.D;
                    }
                    break;
                case -1692490108:
                    if (str.equals("Creatives")) {
                        return this.C;
                    }
                    break;
                case -1164233123:
                    str.equals("Articles");
                    break;
                case -312086034:
                    break;
                case 2606936:
                    break;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01f7 A[Catch: Exception -> 0x03d6, TryCatch #0 {Exception -> 0x03d6, blocks: (B:3:0x0006, B:5:0x0012, B:8:0x001a, B:13:0x0024, B:17:0x0044, B:20:0x004e, B:22:0x0060, B:23:0x0064, B:25:0x006a, B:27:0x007a, B:29:0x0088, B:34:0x0091, B:35:0x0095, B:36:0x00a9, B:39:0x00b3, B:41:0x00c5, B:42:0x00c9, B:44:0x00cf, B:46:0x00df, B:48:0x00ed, B:53:0x00f6, B:54:0x00fa, B:55:0x010e, B:58:0x0118, B:60:0x011e, B:67:0x0130, B:70:0x015b, B:71:0x015f, B:73:0x0165, B:75:0x0177, B:77:0x017f, B:80:0x0185, B:85:0x0191, B:86:0x01ad, B:88:0x01b7, B:90:0x01c8, B:95:0x01d1, B:68:0x013e, B:96:0x01d5, B:99:0x01df, B:101:0x01e5, B:108:0x01f7, B:111:0x0222, B:112:0x0226, B:114:0x022c, B:116:0x023e, B:118:0x0249, B:120:0x024d, B:125:0x0259, B:124:0x0254, B:126:0x025c, B:127:0x027a, B:129:0x0284, B:131:0x0295, B:136:0x029e, B:109:0x0205, B:137:0x02a2, B:140:0x02ac, B:142:0x02b2, B:149:0x02c4, B:152:0x02ef, B:153:0x02f3, B:155:0x02f9, B:157:0x030b, B:159:0x0313, B:162:0x0319, B:167:0x0325, B:168:0x0341, B:170:0x034b, B:172:0x035c, B:177:0x0365, B:150:0x02d2, B:178:0x0369, B:181:0x0372, B:183:0x0384, B:184:0x0388, B:186:0x038e, B:188:0x039e, B:190:0x03ac, B:195:0x03b5, B:196:0x03b9, B:197:0x03cb), top: B:202:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0205 A[Catch: Exception -> 0x03d6, TryCatch #0 {Exception -> 0x03d6, blocks: (B:3:0x0006, B:5:0x0012, B:8:0x001a, B:13:0x0024, B:17:0x0044, B:20:0x004e, B:22:0x0060, B:23:0x0064, B:25:0x006a, B:27:0x007a, B:29:0x0088, B:34:0x0091, B:35:0x0095, B:36:0x00a9, B:39:0x00b3, B:41:0x00c5, B:42:0x00c9, B:44:0x00cf, B:46:0x00df, B:48:0x00ed, B:53:0x00f6, B:54:0x00fa, B:55:0x010e, B:58:0x0118, B:60:0x011e, B:67:0x0130, B:70:0x015b, B:71:0x015f, B:73:0x0165, B:75:0x0177, B:77:0x017f, B:80:0x0185, B:85:0x0191, B:86:0x01ad, B:88:0x01b7, B:90:0x01c8, B:95:0x01d1, B:68:0x013e, B:96:0x01d5, B:99:0x01df, B:101:0x01e5, B:108:0x01f7, B:111:0x0222, B:112:0x0226, B:114:0x022c, B:116:0x023e, B:118:0x0249, B:120:0x024d, B:125:0x0259, B:124:0x0254, B:126:0x025c, B:127:0x027a, B:129:0x0284, B:131:0x0295, B:136:0x029e, B:109:0x0205, B:137:0x02a2, B:140:0x02ac, B:142:0x02b2, B:149:0x02c4, B:152:0x02ef, B:153:0x02f3, B:155:0x02f9, B:157:0x030b, B:159:0x0313, B:162:0x0319, B:167:0x0325, B:168:0x0341, B:170:0x034b, B:172:0x035c, B:177:0x0365, B:150:0x02d2, B:178:0x0369, B:181:0x0372, B:183:0x0384, B:184:0x0388, B:186:0x038e, B:188:0x039e, B:190:0x03ac, B:195:0x03b5, B:196:0x03b9, B:197:0x03cb), top: B:202:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0222 A[Catch: Exception -> 0x03d6, TryCatch #0 {Exception -> 0x03d6, blocks: (B:3:0x0006, B:5:0x0012, B:8:0x001a, B:13:0x0024, B:17:0x0044, B:20:0x004e, B:22:0x0060, B:23:0x0064, B:25:0x006a, B:27:0x007a, B:29:0x0088, B:34:0x0091, B:35:0x0095, B:36:0x00a9, B:39:0x00b3, B:41:0x00c5, B:42:0x00c9, B:44:0x00cf, B:46:0x00df, B:48:0x00ed, B:53:0x00f6, B:54:0x00fa, B:55:0x010e, B:58:0x0118, B:60:0x011e, B:67:0x0130, B:70:0x015b, B:71:0x015f, B:73:0x0165, B:75:0x0177, B:77:0x017f, B:80:0x0185, B:85:0x0191, B:86:0x01ad, B:88:0x01b7, B:90:0x01c8, B:95:0x01d1, B:68:0x013e, B:96:0x01d5, B:99:0x01df, B:101:0x01e5, B:108:0x01f7, B:111:0x0222, B:112:0x0226, B:114:0x022c, B:116:0x023e, B:118:0x0249, B:120:0x024d, B:125:0x0259, B:124:0x0254, B:126:0x025c, B:127:0x027a, B:129:0x0284, B:131:0x0295, B:136:0x029e, B:109:0x0205, B:137:0x02a2, B:140:0x02ac, B:142:0x02b2, B:149:0x02c4, B:152:0x02ef, B:153:0x02f3, B:155:0x02f9, B:157:0x030b, B:159:0x0313, B:162:0x0319, B:167:0x0325, B:168:0x0341, B:170:0x034b, B:172:0x035c, B:177:0x0365, B:150:0x02d2, B:178:0x0369, B:181:0x0372, B:183:0x0384, B:184:0x0388, B:186:0x038e, B:188:0x039e, B:190:0x03ac, B:195:0x03b5, B:196:0x03b9, B:197:0x03cb), top: B:202:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c4 A[Catch: Exception -> 0x03d6, TryCatch #0 {Exception -> 0x03d6, blocks: (B:3:0x0006, B:5:0x0012, B:8:0x001a, B:13:0x0024, B:17:0x0044, B:20:0x004e, B:22:0x0060, B:23:0x0064, B:25:0x006a, B:27:0x007a, B:29:0x0088, B:34:0x0091, B:35:0x0095, B:36:0x00a9, B:39:0x00b3, B:41:0x00c5, B:42:0x00c9, B:44:0x00cf, B:46:0x00df, B:48:0x00ed, B:53:0x00f6, B:54:0x00fa, B:55:0x010e, B:58:0x0118, B:60:0x011e, B:67:0x0130, B:70:0x015b, B:71:0x015f, B:73:0x0165, B:75:0x0177, B:77:0x017f, B:80:0x0185, B:85:0x0191, B:86:0x01ad, B:88:0x01b7, B:90:0x01c8, B:95:0x01d1, B:68:0x013e, B:96:0x01d5, B:99:0x01df, B:101:0x01e5, B:108:0x01f7, B:111:0x0222, B:112:0x0226, B:114:0x022c, B:116:0x023e, B:118:0x0249, B:120:0x024d, B:125:0x0259, B:124:0x0254, B:126:0x025c, B:127:0x027a, B:129:0x0284, B:131:0x0295, B:136:0x029e, B:109:0x0205, B:137:0x02a2, B:140:0x02ac, B:142:0x02b2, B:149:0x02c4, B:152:0x02ef, B:153:0x02f3, B:155:0x02f9, B:157:0x030b, B:159:0x0313, B:162:0x0319, B:167:0x0325, B:168:0x0341, B:170:0x034b, B:172:0x035c, B:177:0x0365, B:150:0x02d2, B:178:0x0369, B:181:0x0372, B:183:0x0384, B:184:0x0388, B:186:0x038e, B:188:0x039e, B:190:0x03ac, B:195:0x03b5, B:196:0x03b9, B:197:0x03cb), top: B:202:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d2 A[Catch: Exception -> 0x03d6, TryCatch #0 {Exception -> 0x03d6, blocks: (B:3:0x0006, B:5:0x0012, B:8:0x001a, B:13:0x0024, B:17:0x0044, B:20:0x004e, B:22:0x0060, B:23:0x0064, B:25:0x006a, B:27:0x007a, B:29:0x0088, B:34:0x0091, B:35:0x0095, B:36:0x00a9, B:39:0x00b3, B:41:0x00c5, B:42:0x00c9, B:44:0x00cf, B:46:0x00df, B:48:0x00ed, B:53:0x00f6, B:54:0x00fa, B:55:0x010e, B:58:0x0118, B:60:0x011e, B:67:0x0130, B:70:0x015b, B:71:0x015f, B:73:0x0165, B:75:0x0177, B:77:0x017f, B:80:0x0185, B:85:0x0191, B:86:0x01ad, B:88:0x01b7, B:90:0x01c8, B:95:0x01d1, B:68:0x013e, B:96:0x01d5, B:99:0x01df, B:101:0x01e5, B:108:0x01f7, B:111:0x0222, B:112:0x0226, B:114:0x022c, B:116:0x023e, B:118:0x0249, B:120:0x024d, B:125:0x0259, B:124:0x0254, B:126:0x025c, B:127:0x027a, B:129:0x0284, B:131:0x0295, B:136:0x029e, B:109:0x0205, B:137:0x02a2, B:140:0x02ac, B:142:0x02b2, B:149:0x02c4, B:152:0x02ef, B:153:0x02f3, B:155:0x02f9, B:157:0x030b, B:159:0x0313, B:162:0x0319, B:167:0x0325, B:168:0x0341, B:170:0x034b, B:172:0x035c, B:177:0x0365, B:150:0x02d2, B:178:0x0369, B:181:0x0372, B:183:0x0384, B:184:0x0388, B:186:0x038e, B:188:0x039e, B:190:0x03ac, B:195:0x03b5, B:196:0x03b9, B:197:0x03cb), top: B:202:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ef A[Catch: Exception -> 0x03d6, TryCatch #0 {Exception -> 0x03d6, blocks: (B:3:0x0006, B:5:0x0012, B:8:0x001a, B:13:0x0024, B:17:0x0044, B:20:0x004e, B:22:0x0060, B:23:0x0064, B:25:0x006a, B:27:0x007a, B:29:0x0088, B:34:0x0091, B:35:0x0095, B:36:0x00a9, B:39:0x00b3, B:41:0x00c5, B:42:0x00c9, B:44:0x00cf, B:46:0x00df, B:48:0x00ed, B:53:0x00f6, B:54:0x00fa, B:55:0x010e, B:58:0x0118, B:60:0x011e, B:67:0x0130, B:70:0x015b, B:71:0x015f, B:73:0x0165, B:75:0x0177, B:77:0x017f, B:80:0x0185, B:85:0x0191, B:86:0x01ad, B:88:0x01b7, B:90:0x01c8, B:95:0x01d1, B:68:0x013e, B:96:0x01d5, B:99:0x01df, B:101:0x01e5, B:108:0x01f7, B:111:0x0222, B:112:0x0226, B:114:0x022c, B:116:0x023e, B:118:0x0249, B:120:0x024d, B:125:0x0259, B:124:0x0254, B:126:0x025c, B:127:0x027a, B:129:0x0284, B:131:0x0295, B:136:0x029e, B:109:0x0205, B:137:0x02a2, B:140:0x02ac, B:142:0x02b2, B:149:0x02c4, B:152:0x02ef, B:153:0x02f3, B:155:0x02f9, B:157:0x030b, B:159:0x0313, B:162:0x0319, B:167:0x0325, B:168:0x0341, B:170:0x034b, B:172:0x035c, B:177:0x0365, B:150:0x02d2, B:178:0x0369, B:181:0x0372, B:183:0x0384, B:184:0x0388, B:186:0x038e, B:188:0x039e, B:190:0x03ac, B:195:0x03b5, B:196:0x03b9, B:197:0x03cb), top: B:202:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130 A[Catch: Exception -> 0x03d6, TryCatch #0 {Exception -> 0x03d6, blocks: (B:3:0x0006, B:5:0x0012, B:8:0x001a, B:13:0x0024, B:17:0x0044, B:20:0x004e, B:22:0x0060, B:23:0x0064, B:25:0x006a, B:27:0x007a, B:29:0x0088, B:34:0x0091, B:35:0x0095, B:36:0x00a9, B:39:0x00b3, B:41:0x00c5, B:42:0x00c9, B:44:0x00cf, B:46:0x00df, B:48:0x00ed, B:53:0x00f6, B:54:0x00fa, B:55:0x010e, B:58:0x0118, B:60:0x011e, B:67:0x0130, B:70:0x015b, B:71:0x015f, B:73:0x0165, B:75:0x0177, B:77:0x017f, B:80:0x0185, B:85:0x0191, B:86:0x01ad, B:88:0x01b7, B:90:0x01c8, B:95:0x01d1, B:68:0x013e, B:96:0x01d5, B:99:0x01df, B:101:0x01e5, B:108:0x01f7, B:111:0x0222, B:112:0x0226, B:114:0x022c, B:116:0x023e, B:118:0x0249, B:120:0x024d, B:125:0x0259, B:124:0x0254, B:126:0x025c, B:127:0x027a, B:129:0x0284, B:131:0x0295, B:136:0x029e, B:109:0x0205, B:137:0x02a2, B:140:0x02ac, B:142:0x02b2, B:149:0x02c4, B:152:0x02ef, B:153:0x02f3, B:155:0x02f9, B:157:0x030b, B:159:0x0313, B:162:0x0319, B:167:0x0325, B:168:0x0341, B:170:0x034b, B:172:0x035c, B:177:0x0365, B:150:0x02d2, B:178:0x0369, B:181:0x0372, B:183:0x0384, B:184:0x0388, B:186:0x038e, B:188:0x039e, B:190:0x03ac, B:195:0x03b5, B:196:0x03b9, B:197:0x03cb), top: B:202:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013e A[Catch: Exception -> 0x03d6, TryCatch #0 {Exception -> 0x03d6, blocks: (B:3:0x0006, B:5:0x0012, B:8:0x001a, B:13:0x0024, B:17:0x0044, B:20:0x004e, B:22:0x0060, B:23:0x0064, B:25:0x006a, B:27:0x007a, B:29:0x0088, B:34:0x0091, B:35:0x0095, B:36:0x00a9, B:39:0x00b3, B:41:0x00c5, B:42:0x00c9, B:44:0x00cf, B:46:0x00df, B:48:0x00ed, B:53:0x00f6, B:54:0x00fa, B:55:0x010e, B:58:0x0118, B:60:0x011e, B:67:0x0130, B:70:0x015b, B:71:0x015f, B:73:0x0165, B:75:0x0177, B:77:0x017f, B:80:0x0185, B:85:0x0191, B:86:0x01ad, B:88:0x01b7, B:90:0x01c8, B:95:0x01d1, B:68:0x013e, B:96:0x01d5, B:99:0x01df, B:101:0x01e5, B:108:0x01f7, B:111:0x0222, B:112:0x0226, B:114:0x022c, B:116:0x023e, B:118:0x0249, B:120:0x024d, B:125:0x0259, B:124:0x0254, B:126:0x025c, B:127:0x027a, B:129:0x0284, B:131:0x0295, B:136:0x029e, B:109:0x0205, B:137:0x02a2, B:140:0x02ac, B:142:0x02b2, B:149:0x02c4, B:152:0x02ef, B:153:0x02f3, B:155:0x02f9, B:157:0x030b, B:159:0x0313, B:162:0x0319, B:167:0x0325, B:168:0x0341, B:170:0x034b, B:172:0x035c, B:177:0x0365, B:150:0x02d2, B:178:0x0369, B:181:0x0372, B:183:0x0384, B:184:0x0388, B:186:0x038e, B:188:0x039e, B:190:0x03ac, B:195:0x03b5, B:196:0x03b9, B:197:0x03cb), top: B:202:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b A[Catch: Exception -> 0x03d6, TryCatch #0 {Exception -> 0x03d6, blocks: (B:3:0x0006, B:5:0x0012, B:8:0x001a, B:13:0x0024, B:17:0x0044, B:20:0x004e, B:22:0x0060, B:23:0x0064, B:25:0x006a, B:27:0x007a, B:29:0x0088, B:34:0x0091, B:35:0x0095, B:36:0x00a9, B:39:0x00b3, B:41:0x00c5, B:42:0x00c9, B:44:0x00cf, B:46:0x00df, B:48:0x00ed, B:53:0x00f6, B:54:0x00fa, B:55:0x010e, B:58:0x0118, B:60:0x011e, B:67:0x0130, B:70:0x015b, B:71:0x015f, B:73:0x0165, B:75:0x0177, B:77:0x017f, B:80:0x0185, B:85:0x0191, B:86:0x01ad, B:88:0x01b7, B:90:0x01c8, B:95:0x01d1, B:68:0x013e, B:96:0x01d5, B:99:0x01df, B:101:0x01e5, B:108:0x01f7, B:111:0x0222, B:112:0x0226, B:114:0x022c, B:116:0x023e, B:118:0x0249, B:120:0x024d, B:125:0x0259, B:124:0x0254, B:126:0x025c, B:127:0x027a, B:129:0x0284, B:131:0x0295, B:136:0x029e, B:109:0x0205, B:137:0x02a2, B:140:0x02ac, B:142:0x02b2, B:149:0x02c4, B:152:0x02ef, B:153:0x02f3, B:155:0x02f9, B:157:0x030b, B:159:0x0313, B:162:0x0319, B:167:0x0325, B:168:0x0341, B:170:0x034b, B:172:0x035c, B:177:0x0365, B:150:0x02d2, B:178:0x0369, B:181:0x0372, B:183:0x0384, B:184:0x0388, B:186:0x038e, B:188:0x039e, B:190:0x03ac, B:195:0x03b5, B:196:0x03b9, B:197:0x03cb), top: B:202:0x0006 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, int i6) {
        ArrayList<LearningHubFieldModel> arrayList;
        String str;
        String str2;
        boolean z10;
        String str3;
        String str4;
        boolean z11;
        boolean z12;
        String str5;
        ArrayList arrayList2;
        boolean z13;
        String str6;
        String str7;
        boolean z14;
        String str8;
        String str9;
        a aVar2 = aVar;
        try {
            LearningHubModel learningHubModel = this.f39651z.get(i6);
            if (learningHubModel != null) {
                arrayList = learningHubModel.getFields();
            } else {
                arrayList = null;
            }
            if (learningHubModel != null) {
                str = learningHubModel.getPost_type();
            } else {
                str = null;
            }
            View view = aVar2.f2751a;
            if (str != null) {
                int hashCode = str.hashCode();
                Context context = this.A;
                switch (hashCode) {
                    case -1864532585:
                        if (!str.equals("Quotes")) {
                            break;
                        } else {
                            ((RobertoTextView) view.findViewById(R.id.tvRowResourcesQuotesDescription)).setText(context.getString(R.string.quote));
                            if (arrayList != null) {
                                Iterator<LearningHubFieldModel> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    LearningHubFieldModel next = it.next();
                                    if (kotlin.jvm.internal.i.b(next.getData_title(), "short_desc")) {
                                        RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvRowResourcesQuotesHeader);
                                        Object value = next.getValue();
                                        if (value instanceof String) {
                                            str2 = (String) value;
                                        } else {
                                            str2 = null;
                                        }
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        robertoTextView.setText(str2);
                                    }
                                }
                            }
                            Object obj = g0.a.f16164a;
                            ((AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesQuotes)).setImageDrawable(a.c.b(context, R.drawable.ic_resources_quotes_bg));
                            break;
                        }
                    case -1732810888:
                        if (!str.equals("Videos")) {
                            break;
                        } else {
                            String duration = learningHubModel.getDuration();
                            if (duration != null && duration.length() != 0) {
                                z10 = false;
                                if (!z10) {
                                    ((RobertoTextView) view.findViewById(R.id.tvRowResourcesVideoDescription)).setText(context.getString(R.string.video));
                                } else {
                                    ((RobertoTextView) view.findViewById(R.id.tvRowResourcesVideoDescription)).setText(context.getString(R.string.dbRaExperimentSubHeader, context.getString(R.string.video), learningHubModel.getDuration()));
                                }
                                if (arrayList != null) {
                                    Iterator<LearningHubFieldModel> it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        LearningHubFieldModel next2 = it2.next();
                                        if (kotlin.jvm.internal.i.b(next2.getData_title(), "thumbnail")) {
                                            Object value2 = next2.getValue();
                                            if (value2 instanceof String) {
                                                str4 = (String) value2;
                                            } else {
                                                str4 = null;
                                            }
                                            if (str4 != null && (!n.B0(str4))) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                com.bumptech.glide.e<Bitmap> a10 = Glide.g(context).a();
                                                a10.Z = next2.getValue();
                                                a10.f5953b0 = true;
                                                a10.B((AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesVideo));
                                            }
                                        }
                                        if (kotlin.jvm.internal.i.b(next2.getData_title(), "title")) {
                                            RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesVideoHeader);
                                            Object value3 = next2.getValue();
                                            if (value3 instanceof String) {
                                                str3 = (String) value3;
                                            } else {
                                                str3 = null;
                                            }
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            robertoTextView2.setText(str3);
                                        }
                                    }
                                    break;
                                }
                            }
                            z10 = true;
                            if (!z10) {
                            }
                            if (arrayList != null) {
                            }
                        }
                        break;
                    case -1692490108:
                        if (!str.equals("Creatives")) {
                            break;
                        } else {
                            String duration2 = learningHubModel.getDuration();
                            if (duration2 != null && duration2.length() != 0) {
                                z12 = false;
                                if (!z12) {
                                    ((RobertoTextView) view.findViewById(R.id.tvRowResourcesCreativesDescription)).setText(context.getString(R.string.creative));
                                } else {
                                    ((RobertoTextView) view.findViewById(R.id.tvRowResourcesCreativesDescription)).setText(context.getString(R.string.dbRaExperimentSubHeader, context.getString(R.string.creative), learningHubModel.getDuration()));
                                }
                                if (arrayList != null) {
                                    Iterator<LearningHubFieldModel> it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        LearningHubFieldModel next3 = it3.next();
                                        if (kotlin.jvm.internal.i.b(next3.getData_title(), "infographic")) {
                                            ArrayList arrayList3 = new ArrayList();
                                            Object value4 = next3.getValue();
                                            if (value4 != null) {
                                                if (value4 instanceof ArrayList) {
                                                    arrayList2 = (ArrayList) value4;
                                                } else {
                                                    arrayList2 = null;
                                                }
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                arrayList3.addAll(arrayList2);
                                            }
                                            com.bumptech.glide.e<Bitmap> a11 = Glide.g(context).a();
                                            a11.Z = (String) u.g2(arrayList3);
                                            a11.f5953b0 = true;
                                            a11.B((AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesCreatives));
                                        }
                                        if (kotlin.jvm.internal.i.b(next3.getData_title(), "title")) {
                                            RobertoTextView robertoTextView3 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesCreativesHeader);
                                            Object value5 = next3.getValue();
                                            if (value5 instanceof String) {
                                                str5 = (String) value5;
                                            } else {
                                                str5 = null;
                                            }
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            robertoTextView3.setText(str5);
                                        }
                                    }
                                    break;
                                }
                            }
                            z12 = true;
                            if (!z12) {
                            }
                            if (arrayList != null) {
                            }
                        }
                        break;
                    case -1164233123:
                        if (!str.equals("Articles")) {
                            break;
                        } else {
                            String duration3 = learningHubModel.getDuration();
                            if (duration3 != null && duration3.length() != 0) {
                                z13 = false;
                                if (!z13) {
                                    ((RobertoTextView) view.findViewById(R.id.tvRowResourcesArticleDescription)).setText(context.getString(R.string.article));
                                } else {
                                    ((RobertoTextView) view.findViewById(R.id.tvRowResourcesArticleDescription)).setText(context.getString(R.string.dbRaExperimentSubHeader, context.getString(R.string.article), learningHubModel.getDuration()));
                                }
                                if (arrayList != null) {
                                    Iterator<LearningHubFieldModel> it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        LearningHubFieldModel next4 = it4.next();
                                        if (kotlin.jvm.internal.i.b(next4.getData_title(), "cover")) {
                                            Object value6 = next4.getValue();
                                            if (value6 instanceof String) {
                                                str7 = (String) value6;
                                            } else {
                                                str7 = null;
                                            }
                                            if (str7 != null && (!n.B0(str7))) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14) {
                                                com.bumptech.glide.e<Bitmap> a12 = Glide.g(context).a();
                                                a12.Z = next4.getValue();
                                                a12.f5953b0 = true;
                                                a12.B((AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesArticle));
                                            }
                                        }
                                        if (kotlin.jvm.internal.i.b(next4.getData_title(), "title")) {
                                            RobertoTextView robertoTextView4 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesArticleHeader);
                                            Object value7 = next4.getValue();
                                            if (value7 instanceof String) {
                                                str6 = (String) value7;
                                            } else {
                                                str6 = null;
                                            }
                                            if (str6 == null) {
                                                str6 = "";
                                            }
                                            robertoTextView4.setText(str6);
                                        }
                                    }
                                    break;
                                }
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (arrayList != null) {
                            }
                        }
                        break;
                    case -312086034:
                        if (!str.equals("Therapist says")) {
                            break;
                        } else {
                            ((RobertoTextView) view.findViewById(R.id.tvRowResourcesQuotesDescription)).setText(context.getString(R.string.therapistSays));
                            if (arrayList != null) {
                                Iterator<LearningHubFieldModel> it5 = arrayList.iterator();
                                while (it5.hasNext()) {
                                    LearningHubFieldModel next5 = it5.next();
                                    if (kotlin.jvm.internal.i.b(next5.getData_title(), "short_desc")) {
                                        RobertoTextView robertoTextView5 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesQuotesHeader);
                                        Object value8 = next5.getValue();
                                        if (value8 instanceof String) {
                                            str8 = (String) value8;
                                        } else {
                                            str8 = null;
                                        }
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        robertoTextView5.setText(str8);
                                    }
                                }
                            }
                            Object obj2 = g0.a.f16164a;
                            ((AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesQuotes)).setImageDrawable(a.c.b(context, R.drawable.ic_resources_therapist_says_bg));
                            break;
                        }
                    case 2606936:
                        if (!str.equals("Tips")) {
                            break;
                        } else {
                            ((RobertoTextView) view.findViewById(R.id.tvRowResourcesQuotesDescription)).setText(context.getString(R.string.tips));
                            if (arrayList != null) {
                                Iterator<LearningHubFieldModel> it6 = arrayList.iterator();
                                while (it6.hasNext()) {
                                    LearningHubFieldModel next6 = it6.next();
                                    if (kotlin.jvm.internal.i.b(next6.getData_title(), "short_desc")) {
                                        RobertoTextView robertoTextView6 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesQuotesHeader);
                                        Object value9 = next6.getValue();
                                        if (value9 instanceof String) {
                                            str9 = (String) value9;
                                        } else {
                                            str9 = null;
                                        }
                                        if (str9 == null) {
                                            str9 = "";
                                        }
                                        robertoTextView6.setText(str9);
                                    }
                                }
                            }
                            Object obj3 = g0.a.f16164a;
                            ((AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesQuotes)).setImageDrawable(a.c.b(context, R.drawable.ic_resources_tips_bg));
                            break;
                        }
                }
            }
            view.setOnClickListener(new w0(learningHubModel, 15, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39650y, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        if (i6 == 0) {
            return new a(defpackage.e.h(parent, R.layout.row_library_dashboard_resources_article, parent, false, "from(parent.context)\n   …s_article, parent, false)"));
        }
        if (i6 == this.B) {
            return new a(defpackage.e.h(parent, R.layout.row_library_dashboard_resources_quotes, parent, false, "from(parent.context).inf…es_quotes, parent, false)"));
        }
        if (i6 == this.C) {
            return new a(defpackage.e.h(parent, R.layout.row_library_dashboard_resources_creatives, parent, false, "from(parent.context).inf…creatives, parent, false)"));
        }
        if (i6 == this.D) {
            return new a(defpackage.e.h(parent, R.layout.row_library_dashboard_resources_video, parent, false, "from(parent.context).inf…ces_video, parent, false)"));
        }
        return new a(defpackage.e.h(parent, R.layout.row_library_dashboard_resources_quotes, parent, false, "from(parent.context).inf…es_quotes, parent, false)"));
    }
}
