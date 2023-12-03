package wm;

import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import kotlin.jvm.internal.i;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class e<T> implements Comparator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ArrayList f36764u;

    public e(ArrayList arrayList) {
        this.f36764u = arrayList;
    }

    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        boolean z10;
        LearningHubModel learningHubModel = (LearningHubModel) t3;
        ArrayList<PostsRead> postsRead = this.f36764u;
        i.f(postsRead, "postsRead");
        boolean z11 = true;
        if (!(postsRead instanceof Collection) || !postsRead.isEmpty()) {
            for (PostsRead postsRead2 : postsRead) {
                if (i.b(postsRead2.getPostId(), learningHubModel.getId())) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        Boolean valueOf = Boolean.valueOf(z10);
        LearningHubModel learningHubModel2 = (LearningHubModel) t10;
        i.f(postsRead, "postsRead");
        if (!(postsRead instanceof Collection) || !postsRead.isEmpty()) {
            for (PostsRead postsRead3 : postsRead) {
                if (i.b(postsRead3.getPostId(), learningHubModel2.getId())) {
                    break;
                }
            }
        }
        z11 = false;
        return sp.b.g(valueOf, Boolean.valueOf(z11));
    }
}
