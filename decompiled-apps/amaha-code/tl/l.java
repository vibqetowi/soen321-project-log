package tl;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Iterator;
import java.util.List;
/* compiled from: ExpertCareDashboardFragment.kt */
/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.k implements ss.l<List<? extends hs.f<? extends zl.b, ? extends Object>>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f33252u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d dVar) {
        super(1);
        this.f33252u = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
        if (r13 == null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    @Override // ss.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k invoke(List<? extends hs.f<? extends zl.b, ? extends Object>> list) {
        d dVar;
        boolean z10;
        RobertoTextView robertoTextView;
        ConstraintLayout constraintLayout;
        RobertoTextView robertoTextView2;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        Integer num;
        w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent;
        TherapistPackagesModel therapistPackagesModel;
        List<? extends hs.f<? extends zl.b, ? extends Object>> filteredListForAllCase = list;
        kotlin.jvm.internal.i.g(filteredListForAllCase, "filteredListForAllCase");
        Boolean bool = Boolean.FALSE;
        int i6 = 0;
        Boolean[] boolArr = {bool, bool, bool};
        Iterator<T> it = filteredListForAllCase.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dVar = this.f33252u;
            if (!hasNext) {
                break;
            }
            hs.f fVar = (hs.f) it.next();
            if (is.k.Q1(fVar.f19464u, new zl.b[]{zl.b.SUGGESTED_THERAPY, zl.b.UPCOMING_THERAPY, zl.b.UPCOMING_IMMEDIATE_THERAPY})) {
                ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookATherapySession)).setVisibility(8);
                boolArr[0] = Boolean.TRUE;
            }
            zl.b[] bVarArr = {zl.b.SUGGESTED_PSYCHIATRY, zl.b.UPCOMING_PSYCHIATRY, zl.b.UPCOMING_IMMEDIATE_PSYCHIATRY};
            A a10 = fVar.f19464u;
            if (is.k.Q1(a10, bVarArr)) {
                ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookAPsychiatristSession)).setVisibility(8);
                boolArr[1] = Boolean.TRUE;
            }
            if (is.k.Q1(a10, new zl.b[]{zl.b.UPCOMING_COUPLES, zl.b.UPCOMING_IMMEDIATE_COUPLES})) {
                ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookACoupleTherapistSession)).setVisibility(8);
                boolArr[2] = Boolean.TRUE;
            }
        }
        int i10 = 0;
        while (true) {
            if (i10 < 3) {
                if (!boolArr[i10].booleanValue()) {
                    z10 = false;
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            if (boolArr[0].booleanValue() && boolArr[1].booleanValue()) {
                zl.o oVar = dVar.f33235v;
                if (oVar != null && (wVar = oVar.f39567z) != null && (d10 = wVar.d()) != null && (peekContent = d10.peekContent()) != null && (therapistPackagesModel = peekContent.f19465v) != null) {
                    num = Integer.valueOf(therapistPackagesModel.getId());
                } else {
                    num = null;
                }
            }
            if (!boolArr[0].booleanValue() && (linearLayoutCompat2 = (LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookATherapySession)) != null) {
                linearLayoutCompat2.setVisibility(0);
            }
            if (!boolArr[1].booleanValue() && (linearLayoutCompat = (LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookAPsychiatristSession)) != null) {
                linearLayoutCompat.setVisibility(0);
            }
            robertoTextView = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvProviderInfoHeader);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(i6);
            }
            constraintLayout = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clProviderInfoContainer);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(i6);
            }
            robertoTextView2 = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvToolsTitle);
            if (robertoTextView2 != null) {
                robertoTextView2.setVisibility(8);
            }
            return hs.k.f19476a;
        }
        i6 = 8;
        robertoTextView = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvProviderInfoHeader);
        if (robertoTextView != null) {
        }
        constraintLayout = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clProviderInfoContainer);
        if (constraintLayout != null) {
        }
        robertoTextView2 = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvToolsTitle);
        if (robertoTextView2 != null) {
        }
        return hs.k.f19476a;
    }
}
