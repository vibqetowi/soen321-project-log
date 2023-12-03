package bm;

import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.recyclerview.widget.RecyclerView;
import bm.i;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.onboarding.model.ProviderListModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4453u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f4454v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f4455w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f4456x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f4457y;

    public /* synthetic */ f(RecyclerView.e eVar, int i6, int i10, Object obj, int i11) {
        this.f4453u = i11;
        this.f4456x = eVar;
        this.f4454v = i6;
        this.f4455w = i10;
        this.f4457y = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f4455w;
        int i10 = this.f4453u;
        int i11 = 0;
        int i12 = this.f4454v;
        Object obj = this.f4457y;
        Object obj2 = this.f4456x;
        switch (i10) {
            case 0:
                String str = (String) obj2;
                i this$0 = (i) obj;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (str != null) {
                    int hashCode = str.hashCode();
                    ArrayList<Object> arrayList = this$0.f4468z;
                    i.b bVar = this$0.A;
                    switch (hashCode) {
                        case -1408757131:
                            if (!str.equals(Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                                return;
                            }
                            break;
                        case -1340224999:
                            if (str.equals(Constants.GOAL_TYPE_THOUGHT)) {
                                if (i12 == 2) {
                                    Object obj3 = arrayList.get(i6);
                                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
                                    bVar.y((Goal) obj3, 1);
                                    this$0.C = -1;
                                } else {
                                    this$0.C = i6;
                                }
                                this$0.j(i6);
                                return;
                            }
                            return;
                        case -1142639703:
                            if (!str.equals(Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                                return;
                            }
                            break;
                        case -961591945:
                            if (!str.equals("physical_activity")) {
                                return;
                            }
                            break;
                        case -517891900:
                            if (str.equals("activity_scheduling")) {
                                if (i12 >= 0) {
                                    Object obj4 = arrayList.get(i6);
                                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
                                    bVar.y((Goal) obj4, -1);
                                    return;
                                }
                                Dialog dialog = UiUtils.Companion.getDialog(R.layout.dashboard_activity_scheduling_popup, this$0.f4466x);
                                AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) dialog.findViewById(R.id.seekbar);
                                appCompatSeekBar.setOnSeekBarChangeListener(new j((ImageView) dialog.findViewById(R.id.img_smiley)));
                                dialog.findViewById(R.id.submit).setOnClickListener(new am.c(dialog, this$0, i6, appCompatSeekBar, 1));
                                dialog.show();
                                return;
                            }
                            return;
                        case 99033460:
                            if (!str.equals(Constants.GOAL_TYPE_HABIT)) {
                                return;
                            }
                            break;
                        default:
                            return;
                    }
                    if (i12 == 2) {
                        Object obj5 = arrayList.get(i6);
                        kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
                        bVar.y((Goal) obj5, 1);
                    } else {
                        Object obj6 = arrayList.get(i6);
                        kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
                        bVar.y((Goal) obj6, 2);
                    }
                    this$0.j(i6);
                    return;
                }
                return;
            case 1:
                np.a this$02 = (np.a) obj2;
                ProviderListModel it = (ProviderListModel) obj;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(it, "$it");
                int size = this$02.f26707x.size();
                if (size != 3) {
                    if (size != 4) {
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 != 3) {
                                        i11 = 3;
                                    } else {
                                        i11 = 2;
                                    }
                                } else {
                                    i11 = 4;
                                }
                            } else {
                                i11 = 1;
                            }
                        }
                    } else {
                        i11 = i6 % this$02.f26707x.size();
                    }
                } else {
                    i11 = i12;
                }
                String uuid = it.getUuid();
                this$02.f26708y.invoke(uuid, it.getFirstname() + ' ' + it.getLastname(), Integer.valueOf(i11));
                return;
            default:
                qp.b this$03 = (qp.b) obj2;
                TherapistPackagesModel it2 = (TherapistPackagesModel) obj;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(it2, "$it");
                int size2 = this$03.f29985x.size();
                if (size2 != 3) {
                    if (size2 != 4) {
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 != 3) {
                                        i11 = 3;
                                    } else {
                                        i11 = 2;
                                    }
                                } else {
                                    i11 = 4;
                                }
                            } else {
                                i11 = 1;
                            }
                        }
                    } else {
                        i11 = i6 % this$03.f29985x.size();
                    }
                } else {
                    i11 = i12;
                }
                String uuid2 = it2.getUuid();
                kotlin.jvm.internal.i.f(uuid2, "it.uuid");
                this$03.A.invoke(uuid2, it2.getFirstname() + ' ' + it2.getLastname(), Integer.valueOf(i11));
                return;
        }
    }

    public /* synthetic */ f(String str, int i6, i iVar, int i10) {
        this.f4453u = 0;
        this.f4456x = str;
        this.f4454v = i6;
        this.f4457y = iVar;
        this.f4455w = i10;
    }
}
