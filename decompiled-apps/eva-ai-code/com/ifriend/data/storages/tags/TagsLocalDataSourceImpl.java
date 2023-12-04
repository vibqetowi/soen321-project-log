package com.ifriend.data.storages.tags;

import com.ifriend.domain.models.Tag;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: TagsLocalDataSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u0016\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J!\u0010\r\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/storages/tags/TagsLocalDataSourceImpl;", "Lcom/ifriend/data/storages/tags/TagsLocalDataSource;", "()V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/ifriend/domain/models/Tag;", "getTags", "getTagsFlow", "Lkotlinx/coroutines/flow/Flow;", "tryUpdate", "", "tags", "update", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TagsLocalDataSourceImpl implements TagsLocalDataSource {
    private final MutableStateFlow<List<Tag>> state = StateFlowKt.MutableStateFlow(null);

    @Override // com.ifriend.data.storages.tags.TagsLocalDataSource
    public Flow<List<Tag>> getTagsFlow() {
        return FlowKt.asStateFlow(this.state);
    }

    @Override // com.ifriend.data.storages.tags.TagsLocalDataSource
    public List<Tag> getTags() {
        return this.state.getValue();
    }

    @Override // com.ifriend.data.storages.tags.TagsLocalDataSource
    public Object update(List<Tag> list, Continuation<? super Unit> continuation) {
        Object emit = this.state.emit(list, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    @Override // com.ifriend.data.storages.tags.TagsLocalDataSource
    public void tryUpdate(List<Tag> list) {
        this.state.tryEmit(list);
    }
}
