package an;

import android.content.Intent;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
/* compiled from: LibraryAllResourcesFragment.kt */
/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.k implements ss.p<LearningHubModel, Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f f710u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        super(2);
        this.f710u = fVar;
    }

    @Override // ss.p
    public final hs.k invoke(LearningHubModel learningHubModel, Boolean bool) {
        Object obj;
        Object obj2;
        String str;
        Object obj3;
        boolean z10;
        boolean z11;
        ArrayList<PostsRead> postsRead;
        LearningHubModel model = learningHubModel;
        boolean booleanValue = bool.booleanValue();
        kotlin.jvm.internal.i.g(model, "model");
        f fVar = this.f710u;
        fVar.startActivity(new Intent(fVar.requireActivity(), LearningHubArticleExperimentActivity.class).putExtra("model", model));
        if (!booleanValue) {
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            User user = firebasePersistence.getUser();
            if (user != null && (postsRead = user.getPostsRead()) != null) {
                PostsRead postsRead2 = new PostsRead();
                postsRead2.setCourseName(fVar.f701v);
                postsRead2.setPostId(model.getId());
                postsRead.add(postsRead2);
            }
            firebasePersistence.updateUserOnFirebase();
        }
        if (model.getId() != null && fVar.f703x != null) {
            Iterator<T> it = model.getFields().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    LearningHubFieldModel learningHubFieldModel = (LearningHubFieldModel) obj;
                    if (kotlin.jvm.internal.i.b(learningHubFieldModel.getData_title(), "title") && kotlin.jvm.internal.i.b(learningHubFieldModel.getData_type(), "text")) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LearningHubFieldModel learningHubFieldModel2 = (LearningHubFieldModel) obj;
            if (learningHubFieldModel2 == null) {
                Iterator<T> it2 = model.getFields().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        LearningHubFieldModel learningHubFieldModel3 = (LearningHubFieldModel) obj3;
                        if (kotlin.jvm.internal.i.b(learningHubFieldModel3.getData_title(), "short_desc") && kotlin.jvm.internal.i.b(learningHubFieldModel3.getData_type(), "text")) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                learningHubFieldModel2 = (LearningHubFieldModel) obj3;
            }
            if (learningHubFieldModel2 != null) {
                obj2 = learningHubFieldModel2.getValue();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            cn.w wVar = fVar.f703x;
            if (wVar != null) {
                String id2 = model.getId();
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                if (id2 != null) {
                    ta.v.H(kc.f.H(wVar), null, 0, new cn.u(wVar, id2, str2, timeInMillis, null), 3);
                }
            } else {
                kotlin.jvm.internal.i.q("libraryResourcesViewModel");
                throw null;
            }
        }
        return hs.k.f19476a;
    }
}
