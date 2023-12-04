package com.ifriend.domain.data;

import com.ifriend.domain.models.Tag;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: TagsProvider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&J\u0016\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/data/TagsProvider;", "", "current", "", "Lcom/ifriend/domain/models/Tag;", "tagsFlow", "Lkotlinx/coroutines/flow/Flow;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TagsProvider {
    List<Tag> current();

    Flow<List<Tag>> tagsFlow();
}
