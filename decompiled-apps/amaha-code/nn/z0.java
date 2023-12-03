package nn;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DBC2Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/z0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class z0 extends Fragment {
    public static final /* synthetic */ int A = 0;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f26674z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public String f26669u = "";

    /* renamed from: v  reason: collision with root package name */
    public String f26670v = "";

    /* renamed from: w  reason: collision with root package name */
    public String f26671w = "";

    /* renamed from: x  reason: collision with root package name */
    public String f26672x = "";

    /* renamed from: y  reason: collision with root package name */
    public final String f26673y = LogHelper.INSTANCE.makeLogTag(z0.class);

    public final void F(boolean z10) {
        try {
            ApplicationPersistence.getInstance().setBooleanValue("dbc2_interaction", true);
            if (z10) {
                ((RobertoTextView) _$_findCachedViewById(R.id.dbc2CardBackHeader)).setText(this.f26669u);
                ((RobertoTextView) _$_findCachedViewById(R.id.dbc2CardBackSubheader)).setText(this.f26670v);
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.dbc2CardBackHeader)).setText(this.f26671w);
                ((RobertoTextView) _$_findCachedViewById(R.id.dbc2CardBackSubheader)).setText(this.f26672x);
            }
            if (getActivity() != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_fade_out_left);
                loadAnimation.setAnimationListener(new a(loadAnimation));
                ((ConstraintLayout) _$_findCachedViewById(R.id.dbc2CardFront)).startAnimation(loadAnimation);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26673y, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c9, code lost:
        r6 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013d A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014e A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016f A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017f A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0197 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a7 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bf A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cc A[Catch: Exception -> 0x01da, TRY_LEAVE, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0123 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012d A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x0076, B:33:0x007e, B:42:0x008e, B:43:0x00bd, B:45:0x00c5, B:54:0x00d5, B:55:0x00d7, B:57:0x00df, B:66:0x00ef, B:67:0x00f1, B:69:0x00f9, B:78:0x0109, B:79:0x010b, B:81:0x0113, B:90:0x0123, B:91:0x0125, B:93:0x012d, B:102:0x013d, B:103:0x0146, B:105:0x014e, B:114:0x015e, B:115:0x0167, B:117:0x016f, B:126:0x017f, B:127:0x018f, B:129:0x0197, B:138:0x01a7, B:139:0x01b7, B:141:0x01bf, B:148:0x01cc), top: B:153:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0139  */
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
        boolean z18;
        String string9;
        boolean z19;
        String string10;
        boolean z20;
        String string11;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string12 = arguments.getString("dbc2_question", "");
                boolean z21 = true;
                if (string12 != null && string12.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string12 = null;
                    }
                    if (string12 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.dbc2CardFrontHeader)).setText(string12);
                    }
                    string = arguments.getString("dbc2_question_image", "");
                    if (string != null && string.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            string = null;
                        }
                        if (string != null) {
                            androidx.fragment.app.p activity = getActivity();
                            kotlin.jvm.internal.i.d(activity);
                            com.bumptech.glide.f d10 = Glide.c(activity).d(activity);
                            androidx.fragment.app.p activity2 = getActivity();
                            kotlin.jvm.internal.i.d(activity2);
                            d10.d(new File(activity2.getFilesDir(), string)).B((AppCompatImageView) _$_findCachedViewById(R.id.dbc2CardFrontImage));
                        }
                        string2 = arguments.getString("dbc2_option_image", "");
                        if (string2 != null && string2.length() != 0) {
                            z12 = false;
                            if (!z12) {
                                string2 = null;
                            }
                            if (string2 != null) {
                                androidx.fragment.app.p activity3 = getActivity();
                                kotlin.jvm.internal.i.d(activity3);
                                com.bumptech.glide.f d11 = Glide.c(activity3).d(activity3);
                                androidx.fragment.app.p activity4 = getActivity();
                                kotlin.jvm.internal.i.d(activity4);
                                d11.d(new File(activity4.getFilesDir(), string2)).B((AppCompatImageView) _$_findCachedViewById(R.id.dbc2CardBackImage));
                            }
                            string3 = arguments.getString("dbc2_option1_title", "");
                            if (string3 != null && string3.length() != 0) {
                                z13 = false;
                                if (!z13) {
                                    string3 = null;
                                }
                                if (string3 != null) {
                                    this.f26669u = string3;
                                }
                                string4 = arguments.getString("dbc2_option1_description", "");
                                if (string4 != null && string4.length() != 0) {
                                    z14 = false;
                                    if (!z14) {
                                        string4 = null;
                                    }
                                    if (string4 != null) {
                                        this.f26670v = string4;
                                    }
                                    string5 = arguments.getString("dbc2_option2_title", "");
                                    if (string5 != null && string5.length() != 0) {
                                        z15 = false;
                                        if (!z15) {
                                            string5 = null;
                                        }
                                        if (string5 != null) {
                                            this.f26671w = string5;
                                        }
                                        string6 = arguments.getString("dbc2_option2_description", "");
                                        if (string6 != null && string6.length() != 0) {
                                            z16 = false;
                                            if (!z16) {
                                                string6 = null;
                                            }
                                            if (string6 != null) {
                                                this.f26672x = string6;
                                            }
                                            string7 = arguments.getString("dbc2_option0_title", "");
                                            if (string7 != null && string7.length() != 0) {
                                                z17 = false;
                                                if (!z17) {
                                                    string7 = null;
                                                }
                                                if (string7 != null) {
                                                    ApplicationPersistence.getInstance().setStringValue("dbc2_neutral_header", string7);
                                                }
                                                string8 = arguments.getString("dbc2_option0_description", "");
                                                if (string8 != null && string8.length() != 0) {
                                                    z18 = false;
                                                    if (!z18) {
                                                        string8 = null;
                                                    }
                                                    if (string8 != null) {
                                                        ApplicationPersistence.getInstance().setStringValue("dbc2_neutral_subheader", string8);
                                                    }
                                                    string9 = arguments.getString("dbc2_option_title_color", "");
                                                    if (string9 != null && string9.length() != 0) {
                                                        z19 = false;
                                                        if (!z19) {
                                                            string9 = null;
                                                        }
                                                        if (string9 != null) {
                                                            ((RobertoTextView) _$_findCachedViewById(R.id.dbc2CardBackHeader)).setTextColor(Color.parseColor(string9));
                                                        }
                                                        string10 = arguments.getString("dbc2_option_description_color", "");
                                                        if (string10 != null && string10.length() != 0) {
                                                            z20 = false;
                                                            if (!z20) {
                                                                string10 = null;
                                                            }
                                                            if (string10 != null) {
                                                                ((RobertoTextView) _$_findCachedViewById(R.id.dbc2CardBackSubheader)).setTextColor(Color.parseColor(string10));
                                                            }
                                                            string11 = arguments.getString("dbc2_question_color", "");
                                                            if (string11 != null && string11.length() != 0) {
                                                                z21 = false;
                                                            }
                                                            if (str == null) {
                                                                ((RobertoTextView) _$_findCachedViewById(R.id.dbc2CardFrontHeader)).setTextColor(Color.parseColor(str));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        z20 = true;
                                                        if (!z20) {
                                                        }
                                                        if (string10 != null) {
                                                        }
                                                        string11 = arguments.getString("dbc2_question_color", "");
                                                        if (string11 != null) {
                                                            z21 = false;
                                                        }
                                                        if (str == null) {
                                                        }
                                                    }
                                                    z19 = true;
                                                    if (!z19) {
                                                    }
                                                    if (string9 != null) {
                                                    }
                                                    string10 = arguments.getString("dbc2_option_description_color", "");
                                                    if (string10 != null) {
                                                        z20 = false;
                                                        if (!z20) {
                                                        }
                                                        if (string10 != null) {
                                                        }
                                                        string11 = arguments.getString("dbc2_question_color", "");
                                                        if (string11 != null) {
                                                        }
                                                        if (str == null) {
                                                        }
                                                    }
                                                    z20 = true;
                                                    if (!z20) {
                                                    }
                                                    if (string10 != null) {
                                                    }
                                                    string11 = arguments.getString("dbc2_question_color", "");
                                                    if (string11 != null) {
                                                    }
                                                    if (str == null) {
                                                    }
                                                }
                                                z18 = true;
                                                if (!z18) {
                                                }
                                                if (string8 != null) {
                                                }
                                                string9 = arguments.getString("dbc2_option_title_color", "");
                                                if (string9 != null) {
                                                    z19 = false;
                                                    if (!z19) {
                                                    }
                                                    if (string9 != null) {
                                                    }
                                                    string10 = arguments.getString("dbc2_option_description_color", "");
                                                    if (string10 != null) {
                                                    }
                                                    z20 = true;
                                                    if (!z20) {
                                                    }
                                                    if (string10 != null) {
                                                    }
                                                    string11 = arguments.getString("dbc2_question_color", "");
                                                    if (string11 != null) {
                                                    }
                                                    if (str == null) {
                                                    }
                                                }
                                                z19 = true;
                                                if (!z19) {
                                                }
                                                if (string9 != null) {
                                                }
                                                string10 = arguments.getString("dbc2_option_description_color", "");
                                                if (string10 != null) {
                                                }
                                                z20 = true;
                                                if (!z20) {
                                                }
                                                if (string10 != null) {
                                                }
                                                string11 = arguments.getString("dbc2_question_color", "");
                                                if (string11 != null) {
                                                }
                                                if (str == null) {
                                                }
                                            }
                                            z17 = true;
                                            if (!z17) {
                                            }
                                            if (string7 != null) {
                                            }
                                            string8 = arguments.getString("dbc2_option0_description", "");
                                            if (string8 != null) {
                                                z18 = false;
                                                if (!z18) {
                                                }
                                                if (string8 != null) {
                                                }
                                                string9 = arguments.getString("dbc2_option_title_color", "");
                                                if (string9 != null) {
                                                }
                                                z19 = true;
                                                if (!z19) {
                                                }
                                                if (string9 != null) {
                                                }
                                                string10 = arguments.getString("dbc2_option_description_color", "");
                                                if (string10 != null) {
                                                }
                                                z20 = true;
                                                if (!z20) {
                                                }
                                                if (string10 != null) {
                                                }
                                                string11 = arguments.getString("dbc2_question_color", "");
                                                if (string11 != null) {
                                                }
                                                if (str == null) {
                                                }
                                            }
                                            z18 = true;
                                            if (!z18) {
                                            }
                                            if (string8 != null) {
                                            }
                                            string9 = arguments.getString("dbc2_option_title_color", "");
                                            if (string9 != null) {
                                            }
                                            z19 = true;
                                            if (!z19) {
                                            }
                                            if (string9 != null) {
                                            }
                                            string10 = arguments.getString("dbc2_option_description_color", "");
                                            if (string10 != null) {
                                            }
                                            z20 = true;
                                            if (!z20) {
                                            }
                                            if (string10 != null) {
                                            }
                                            string11 = arguments.getString("dbc2_question_color", "");
                                            if (string11 != null) {
                                            }
                                            if (str == null) {
                                            }
                                        }
                                        z16 = true;
                                        if (!z16) {
                                        }
                                        if (string6 != null) {
                                        }
                                        string7 = arguments.getString("dbc2_option0_title", "");
                                        if (string7 != null) {
                                            z17 = false;
                                            if (!z17) {
                                            }
                                            if (string7 != null) {
                                            }
                                            string8 = arguments.getString("dbc2_option0_description", "");
                                            if (string8 != null) {
                                            }
                                            z18 = true;
                                            if (!z18) {
                                            }
                                            if (string8 != null) {
                                            }
                                            string9 = arguments.getString("dbc2_option_title_color", "");
                                            if (string9 != null) {
                                            }
                                            z19 = true;
                                            if (!z19) {
                                            }
                                            if (string9 != null) {
                                            }
                                            string10 = arguments.getString("dbc2_option_description_color", "");
                                            if (string10 != null) {
                                            }
                                            z20 = true;
                                            if (!z20) {
                                            }
                                            if (string10 != null) {
                                            }
                                            string11 = arguments.getString("dbc2_question_color", "");
                                            if (string11 != null) {
                                            }
                                            if (str == null) {
                                            }
                                        }
                                        z17 = true;
                                        if (!z17) {
                                        }
                                        if (string7 != null) {
                                        }
                                        string8 = arguments.getString("dbc2_option0_description", "");
                                        if (string8 != null) {
                                        }
                                        z18 = true;
                                        if (!z18) {
                                        }
                                        if (string8 != null) {
                                        }
                                        string9 = arguments.getString("dbc2_option_title_color", "");
                                        if (string9 != null) {
                                        }
                                        z19 = true;
                                        if (!z19) {
                                        }
                                        if (string9 != null) {
                                        }
                                        string10 = arguments.getString("dbc2_option_description_color", "");
                                        if (string10 != null) {
                                        }
                                        z20 = true;
                                        if (!z20) {
                                        }
                                        if (string10 != null) {
                                        }
                                        string11 = arguments.getString("dbc2_question_color", "");
                                        if (string11 != null) {
                                        }
                                        if (str == null) {
                                        }
                                    }
                                    z15 = true;
                                    if (!z15) {
                                    }
                                    if (string5 != null) {
                                    }
                                    string6 = arguments.getString("dbc2_option2_description", "");
                                    if (string6 != null) {
                                        z16 = false;
                                        if (!z16) {
                                        }
                                        if (string6 != null) {
                                        }
                                        string7 = arguments.getString("dbc2_option0_title", "");
                                        if (string7 != null) {
                                        }
                                        z17 = true;
                                        if (!z17) {
                                        }
                                        if (string7 != null) {
                                        }
                                        string8 = arguments.getString("dbc2_option0_description", "");
                                        if (string8 != null) {
                                        }
                                        z18 = true;
                                        if (!z18) {
                                        }
                                        if (string8 != null) {
                                        }
                                        string9 = arguments.getString("dbc2_option_title_color", "");
                                        if (string9 != null) {
                                        }
                                        z19 = true;
                                        if (!z19) {
                                        }
                                        if (string9 != null) {
                                        }
                                        string10 = arguments.getString("dbc2_option_description_color", "");
                                        if (string10 != null) {
                                        }
                                        z20 = true;
                                        if (!z20) {
                                        }
                                        if (string10 != null) {
                                        }
                                        string11 = arguments.getString("dbc2_question_color", "");
                                        if (string11 != null) {
                                        }
                                        if (str == null) {
                                        }
                                    }
                                    z16 = true;
                                    if (!z16) {
                                    }
                                    if (string6 != null) {
                                    }
                                    string7 = arguments.getString("dbc2_option0_title", "");
                                    if (string7 != null) {
                                    }
                                    z17 = true;
                                    if (!z17) {
                                    }
                                    if (string7 != null) {
                                    }
                                    string8 = arguments.getString("dbc2_option0_description", "");
                                    if (string8 != null) {
                                    }
                                    z18 = true;
                                    if (!z18) {
                                    }
                                    if (string8 != null) {
                                    }
                                    string9 = arguments.getString("dbc2_option_title_color", "");
                                    if (string9 != null) {
                                    }
                                    z19 = true;
                                    if (!z19) {
                                    }
                                    if (string9 != null) {
                                    }
                                    string10 = arguments.getString("dbc2_option_description_color", "");
                                    if (string10 != null) {
                                    }
                                    z20 = true;
                                    if (!z20) {
                                    }
                                    if (string10 != null) {
                                    }
                                    string11 = arguments.getString("dbc2_question_color", "");
                                    if (string11 != null) {
                                    }
                                    if (str == null) {
                                    }
                                }
                                z14 = true;
                                if (!z14) {
                                }
                                if (string4 != null) {
                                }
                                string5 = arguments.getString("dbc2_option2_title", "");
                                if (string5 != null) {
                                    z15 = false;
                                    if (!z15) {
                                    }
                                    if (string5 != null) {
                                    }
                                    string6 = arguments.getString("dbc2_option2_description", "");
                                    if (string6 != null) {
                                    }
                                    z16 = true;
                                    if (!z16) {
                                    }
                                    if (string6 != null) {
                                    }
                                    string7 = arguments.getString("dbc2_option0_title", "");
                                    if (string7 != null) {
                                    }
                                    z17 = true;
                                    if (!z17) {
                                    }
                                    if (string7 != null) {
                                    }
                                    string8 = arguments.getString("dbc2_option0_description", "");
                                    if (string8 != null) {
                                    }
                                    z18 = true;
                                    if (!z18) {
                                    }
                                    if (string8 != null) {
                                    }
                                    string9 = arguments.getString("dbc2_option_title_color", "");
                                    if (string9 != null) {
                                    }
                                    z19 = true;
                                    if (!z19) {
                                    }
                                    if (string9 != null) {
                                    }
                                    string10 = arguments.getString("dbc2_option_description_color", "");
                                    if (string10 != null) {
                                    }
                                    z20 = true;
                                    if (!z20) {
                                    }
                                    if (string10 != null) {
                                    }
                                    string11 = arguments.getString("dbc2_question_color", "");
                                    if (string11 != null) {
                                    }
                                    if (str == null) {
                                    }
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (string5 != null) {
                                }
                                string6 = arguments.getString("dbc2_option2_description", "");
                                if (string6 != null) {
                                }
                                z16 = true;
                                if (!z16) {
                                }
                                if (string6 != null) {
                                }
                                string7 = arguments.getString("dbc2_option0_title", "");
                                if (string7 != null) {
                                }
                                z17 = true;
                                if (!z17) {
                                }
                                if (string7 != null) {
                                }
                                string8 = arguments.getString("dbc2_option0_description", "");
                                if (string8 != null) {
                                }
                                z18 = true;
                                if (!z18) {
                                }
                                if (string8 != null) {
                                }
                                string9 = arguments.getString("dbc2_option_title_color", "");
                                if (string9 != null) {
                                }
                                z19 = true;
                                if (!z19) {
                                }
                                if (string9 != null) {
                                }
                                string10 = arguments.getString("dbc2_option_description_color", "");
                                if (string10 != null) {
                                }
                                z20 = true;
                                if (!z20) {
                                }
                                if (string10 != null) {
                                }
                                string11 = arguments.getString("dbc2_question_color", "");
                                if (string11 != null) {
                                }
                                if (str == null) {
                                }
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (string3 != null) {
                            }
                            string4 = arguments.getString("dbc2_option1_description", "");
                            if (string4 != null) {
                                z14 = false;
                                if (!z14) {
                                }
                                if (string4 != null) {
                                }
                                string5 = arguments.getString("dbc2_option2_title", "");
                                if (string5 != null) {
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (string5 != null) {
                                }
                                string6 = arguments.getString("dbc2_option2_description", "");
                                if (string6 != null) {
                                }
                                z16 = true;
                                if (!z16) {
                                }
                                if (string6 != null) {
                                }
                                string7 = arguments.getString("dbc2_option0_title", "");
                                if (string7 != null) {
                                }
                                z17 = true;
                                if (!z17) {
                                }
                                if (string7 != null) {
                                }
                                string8 = arguments.getString("dbc2_option0_description", "");
                                if (string8 != null) {
                                }
                                z18 = true;
                                if (!z18) {
                                }
                                if (string8 != null) {
                                }
                                string9 = arguments.getString("dbc2_option_title_color", "");
                                if (string9 != null) {
                                }
                                z19 = true;
                                if (!z19) {
                                }
                                if (string9 != null) {
                                }
                                string10 = arguments.getString("dbc2_option_description_color", "");
                                if (string10 != null) {
                                }
                                z20 = true;
                                if (!z20) {
                                }
                                if (string10 != null) {
                                }
                                string11 = arguments.getString("dbc2_question_color", "");
                                if (string11 != null) {
                                }
                                if (str == null) {
                                }
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (string4 != null) {
                            }
                            string5 = arguments.getString("dbc2_option2_title", "");
                            if (string5 != null) {
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            if (string5 != null) {
                            }
                            string6 = arguments.getString("dbc2_option2_description", "");
                            if (string6 != null) {
                            }
                            z16 = true;
                            if (!z16) {
                            }
                            if (string6 != null) {
                            }
                            string7 = arguments.getString("dbc2_option0_title", "");
                            if (string7 != null) {
                            }
                            z17 = true;
                            if (!z17) {
                            }
                            if (string7 != null) {
                            }
                            string8 = arguments.getString("dbc2_option0_description", "");
                            if (string8 != null) {
                            }
                            z18 = true;
                            if (!z18) {
                            }
                            if (string8 != null) {
                            }
                            string9 = arguments.getString("dbc2_option_title_color", "");
                            if (string9 != null) {
                            }
                            z19 = true;
                            if (!z19) {
                            }
                            if (string9 != null) {
                            }
                            string10 = arguments.getString("dbc2_option_description_color", "");
                            if (string10 != null) {
                            }
                            z20 = true;
                            if (!z20) {
                            }
                            if (string10 != null) {
                            }
                            string11 = arguments.getString("dbc2_question_color", "");
                            if (string11 != null) {
                            }
                            if (str == null) {
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        if (string2 != null) {
                        }
                        string3 = arguments.getString("dbc2_option1_title", "");
                        if (string3 != null) {
                            z13 = false;
                            if (!z13) {
                            }
                            if (string3 != null) {
                            }
                            string4 = arguments.getString("dbc2_option1_description", "");
                            if (string4 != null) {
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (string4 != null) {
                            }
                            string5 = arguments.getString("dbc2_option2_title", "");
                            if (string5 != null) {
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            if (string5 != null) {
                            }
                            string6 = arguments.getString("dbc2_option2_description", "");
                            if (string6 != null) {
                            }
                            z16 = true;
                            if (!z16) {
                            }
                            if (string6 != null) {
                            }
                            string7 = arguments.getString("dbc2_option0_title", "");
                            if (string7 != null) {
                            }
                            z17 = true;
                            if (!z17) {
                            }
                            if (string7 != null) {
                            }
                            string8 = arguments.getString("dbc2_option0_description", "");
                            if (string8 != null) {
                            }
                            z18 = true;
                            if (!z18) {
                            }
                            if (string8 != null) {
                            }
                            string9 = arguments.getString("dbc2_option_title_color", "");
                            if (string9 != null) {
                            }
                            z19 = true;
                            if (!z19) {
                            }
                            if (string9 != null) {
                            }
                            string10 = arguments.getString("dbc2_option_description_color", "");
                            if (string10 != null) {
                            }
                            z20 = true;
                            if (!z20) {
                            }
                            if (string10 != null) {
                            }
                            string11 = arguments.getString("dbc2_question_color", "");
                            if (string11 != null) {
                            }
                            if (str == null) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (string3 != null) {
                        }
                        string4 = arguments.getString("dbc2_option1_description", "");
                        if (string4 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (string4 != null) {
                        }
                        string5 = arguments.getString("dbc2_option2_title", "");
                        if (string5 != null) {
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        if (string5 != null) {
                        }
                        string6 = arguments.getString("dbc2_option2_description", "");
                        if (string6 != null) {
                        }
                        z16 = true;
                        if (!z16) {
                        }
                        if (string6 != null) {
                        }
                        string7 = arguments.getString("dbc2_option0_title", "");
                        if (string7 != null) {
                        }
                        z17 = true;
                        if (!z17) {
                        }
                        if (string7 != null) {
                        }
                        string8 = arguments.getString("dbc2_option0_description", "");
                        if (string8 != null) {
                        }
                        z18 = true;
                        if (!z18) {
                        }
                        if (string8 != null) {
                        }
                        string9 = arguments.getString("dbc2_option_title_color", "");
                        if (string9 != null) {
                        }
                        z19 = true;
                        if (!z19) {
                        }
                        if (string9 != null) {
                        }
                        string10 = arguments.getString("dbc2_option_description_color", "");
                        if (string10 != null) {
                        }
                        z20 = true;
                        if (!z20) {
                        }
                        if (string10 != null) {
                        }
                        string11 = arguments.getString("dbc2_question_color", "");
                        if (string11 != null) {
                        }
                        if (str == null) {
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    string2 = arguments.getString("dbc2_option_image", "");
                    if (string2 != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (string2 != null) {
                        }
                        string3 = arguments.getString("dbc2_option1_title", "");
                        if (string3 != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (string3 != null) {
                        }
                        string4 = arguments.getString("dbc2_option1_description", "");
                        if (string4 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (string4 != null) {
                        }
                        string5 = arguments.getString("dbc2_option2_title", "");
                        if (string5 != null) {
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        if (string5 != null) {
                        }
                        string6 = arguments.getString("dbc2_option2_description", "");
                        if (string6 != null) {
                        }
                        z16 = true;
                        if (!z16) {
                        }
                        if (string6 != null) {
                        }
                        string7 = arguments.getString("dbc2_option0_title", "");
                        if (string7 != null) {
                        }
                        z17 = true;
                        if (!z17) {
                        }
                        if (string7 != null) {
                        }
                        string8 = arguments.getString("dbc2_option0_description", "");
                        if (string8 != null) {
                        }
                        z18 = true;
                        if (!z18) {
                        }
                        if (string8 != null) {
                        }
                        string9 = arguments.getString("dbc2_option_title_color", "");
                        if (string9 != null) {
                        }
                        z19 = true;
                        if (!z19) {
                        }
                        if (string9 != null) {
                        }
                        string10 = arguments.getString("dbc2_option_description_color", "");
                        if (string10 != null) {
                        }
                        z20 = true;
                        if (!z20) {
                        }
                        if (string10 != null) {
                        }
                        string11 = arguments.getString("dbc2_question_color", "");
                        if (string11 != null) {
                        }
                        if (str == null) {
                        }
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (string2 != null) {
                    }
                    string3 = arguments.getString("dbc2_option1_title", "");
                    if (string3 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (string3 != null) {
                    }
                    string4 = arguments.getString("dbc2_option1_description", "");
                    if (string4 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (string4 != null) {
                    }
                    string5 = arguments.getString("dbc2_option2_title", "");
                    if (string5 != null) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (string5 != null) {
                    }
                    string6 = arguments.getString("dbc2_option2_description", "");
                    if (string6 != null) {
                    }
                    z16 = true;
                    if (!z16) {
                    }
                    if (string6 != null) {
                    }
                    string7 = arguments.getString("dbc2_option0_title", "");
                    if (string7 != null) {
                    }
                    z17 = true;
                    if (!z17) {
                    }
                    if (string7 != null) {
                    }
                    string8 = arguments.getString("dbc2_option0_description", "");
                    if (string8 != null) {
                    }
                    z18 = true;
                    if (!z18) {
                    }
                    if (string8 != null) {
                    }
                    string9 = arguments.getString("dbc2_option_title_color", "");
                    if (string9 != null) {
                    }
                    z19 = true;
                    if (!z19) {
                    }
                    if (string9 != null) {
                    }
                    string10 = arguments.getString("dbc2_option_description_color", "");
                    if (string10 != null) {
                    }
                    z20 = true;
                    if (!z20) {
                    }
                    if (string10 != null) {
                    }
                    string11 = arguments.getString("dbc2_question_color", "");
                    if (string11 != null) {
                    }
                    if (str == null) {
                    }
                }
                z10 = true;
                str = null;
                if (!z10) {
                }
                if (string12 != null) {
                }
                string = arguments.getString("dbc2_question_image", "");
                if (string != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    string2 = arguments.getString("dbc2_option_image", "");
                    if (string2 != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (string2 != null) {
                    }
                    string3 = arguments.getString("dbc2_option1_title", "");
                    if (string3 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (string3 != null) {
                    }
                    string4 = arguments.getString("dbc2_option1_description", "");
                    if (string4 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (string4 != null) {
                    }
                    string5 = arguments.getString("dbc2_option2_title", "");
                    if (string5 != null) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (string5 != null) {
                    }
                    string6 = arguments.getString("dbc2_option2_description", "");
                    if (string6 != null) {
                    }
                    z16 = true;
                    if (!z16) {
                    }
                    if (string6 != null) {
                    }
                    string7 = arguments.getString("dbc2_option0_title", "");
                    if (string7 != null) {
                    }
                    z17 = true;
                    if (!z17) {
                    }
                    if (string7 != null) {
                    }
                    string8 = arguments.getString("dbc2_option0_description", "");
                    if (string8 != null) {
                    }
                    z18 = true;
                    if (!z18) {
                    }
                    if (string8 != null) {
                    }
                    string9 = arguments.getString("dbc2_option_title_color", "");
                    if (string9 != null) {
                    }
                    z19 = true;
                    if (!z19) {
                    }
                    if (string9 != null) {
                    }
                    string10 = arguments.getString("dbc2_option_description_color", "");
                    if (string10 != null) {
                    }
                    z20 = true;
                    if (!z20) {
                    }
                    if (string10 != null) {
                    }
                    string11 = arguments.getString("dbc2_question_color", "");
                    if (string11 != null) {
                    }
                    if (str == null) {
                    }
                }
                z11 = true;
                if (!z11) {
                }
                if (string != null) {
                }
                string2 = arguments.getString("dbc2_option_image", "");
                if (string2 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (string2 != null) {
                }
                string3 = arguments.getString("dbc2_option1_title", "");
                if (string3 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (string3 != null) {
                }
                string4 = arguments.getString("dbc2_option1_description", "");
                if (string4 != null) {
                }
                z14 = true;
                if (!z14) {
                }
                if (string4 != null) {
                }
                string5 = arguments.getString("dbc2_option2_title", "");
                if (string5 != null) {
                }
                z15 = true;
                if (!z15) {
                }
                if (string5 != null) {
                }
                string6 = arguments.getString("dbc2_option2_description", "");
                if (string6 != null) {
                }
                z16 = true;
                if (!z16) {
                }
                if (string6 != null) {
                }
                string7 = arguments.getString("dbc2_option0_title", "");
                if (string7 != null) {
                }
                z17 = true;
                if (!z17) {
                }
                if (string7 != null) {
                }
                string8 = arguments.getString("dbc2_option0_description", "");
                if (string8 != null) {
                }
                z18 = true;
                if (!z18) {
                }
                if (string8 != null) {
                }
                string9 = arguments.getString("dbc2_option_title_color", "");
                if (string9 != null) {
                }
                z19 = true;
                if (!z19) {
                }
                if (string9 != null) {
                }
                string10 = arguments.getString("dbc2_option_description_color", "");
                if (string10 != null) {
                }
                z20 = true;
                if (!z20) {
                }
                if (string10 != null) {
                }
                string11 = arguments.getString("dbc2_question_color", "");
                if (string11 != null) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26673y, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26674z;
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
        return inflater.inflate(R.layout.fragment_dbc2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f26674z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            I();
            if (ApplicationPersistence.getInstance().getBooleanValue("dbc2_interaction", false)) {
                ((ConstraintLayout) _$_findCachedViewById(R.id.dbc2CardBack)).setVisibility(0);
                ((ConstraintLayout) _$_findCachedViewById(R.id.dbc2CardFront)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.dbc2CardBackHeader)).setText(ApplicationPersistence.getInstance().getStringValue("dbc2_neutral_header"));
                ((RobertoTextView) _$_findCachedViewById(R.id.dbc2CardBackSubheader)).setText(ApplicationPersistence.getInstance().getStringValue("dbc2_neutral_subheader"));
                ((ConstraintLayout) _$_findCachedViewById(R.id.dbc2CardBack)).setOnClickListener(new y0(this, 0));
            } else {
                ((ConstraintLayout) _$_findCachedViewById(R.id.dbc2CardFront)).setOnClickListener(new il.g(17));
                ((ConstraintLayout) _$_findCachedViewById(R.id.dbc2CardBack)).setOnClickListener(new il.g(18));
                ((ConstraintLayout) _$_findCachedViewById(R.id.dbc2CardBack)).setVisibility(0);
                ((ConstraintLayout) _$_findCachedViewById(R.id.dbc2CardFront)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.dbc2CardFrontCtaYes)).setOnClickListener(new y0(this, 1));
                ((RobertoTextView) _$_findCachedViewById(R.id.dbc2CardFrontCtaNo)).setOnClickListener(new y0(this, 2));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26673y, e10);
        }
    }

    /* compiled from: DBC2Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animation.AnimationListener {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Animation f26676v;

        public a(Animation animation) {
            this.f26676v = animation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            z0 z0Var = z0.this;
            ((ConstraintLayout) z0Var._$_findCachedViewById(R.id.dbc2CardFront)).setVisibility(8);
            ((ConstraintLayout) z0Var._$_findCachedViewById(R.id.dbc2CardBack)).setOnClickListener(new y0(z0Var, 3));
            this.f26676v.setAnimationListener(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }
}
