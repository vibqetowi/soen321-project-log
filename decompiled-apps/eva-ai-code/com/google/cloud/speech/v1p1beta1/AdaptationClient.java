package com.google.cloud.speech.v1p1beta1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.speech.v1p1beta1.stub.AdaptationStub;
import com.google.cloud.speech.v1p1beta1.stub.AdaptationStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
@BetaApi
/* loaded from: classes7.dex */
public class AdaptationClient implements BackgroundResource {
    private final AdaptationSettings settings;
    private final AdaptationStub stub;

    public static final AdaptationClient create() throws IOException {
        return create(AdaptationSettings.newBuilder().build());
    }

    public static final AdaptationClient create(AdaptationSettings adaptationSettings) throws IOException {
        return new AdaptationClient(adaptationSettings);
    }

    @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
    public static final AdaptationClient create(AdaptationStub adaptationStub) {
        return new AdaptationClient(adaptationStub);
    }

    protected AdaptationClient(AdaptationSettings adaptationSettings) throws IOException {
        this.settings = adaptationSettings;
        this.stub = ((AdaptationStubSettings) adaptationSettings.getStubSettings()).createStub();
    }

    @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
    protected AdaptationClient(AdaptationStub adaptationStub) {
        this.settings = null;
        this.stub = adaptationStub;
    }

    public final AdaptationSettings getSettings() {
        return this.settings;
    }

    @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
    public AdaptationStub getStub() {
        return this.stub;
    }

    public final PhraseSet createPhraseSet(LocationName locationName, PhraseSet phraseSet, String str) {
        return createPhraseSet(CreatePhraseSetRequest.newBuilder().setParent(locationName == null ? null : locationName.toString()).setPhraseSet(phraseSet).setPhraseSetId(str).build());
    }

    public final PhraseSet createPhraseSet(String str, PhraseSet phraseSet, String str2) {
        return createPhraseSet(CreatePhraseSetRequest.newBuilder().setParent(str).setPhraseSet(phraseSet).setPhraseSetId(str2).build());
    }

    public final PhraseSet createPhraseSet(CreatePhraseSetRequest createPhraseSetRequest) {
        return createPhraseSetCallable().call(createPhraseSetRequest);
    }

    public final UnaryCallable<CreatePhraseSetRequest, PhraseSet> createPhraseSetCallable() {
        return this.stub.createPhraseSetCallable();
    }

    public final PhraseSet getPhraseSet(PhraseSetName phraseSetName) {
        return getPhraseSet(GetPhraseSetRequest.newBuilder().setName(phraseSetName == null ? null : phraseSetName.toString()).build());
    }

    public final PhraseSet getPhraseSet(String str) {
        return getPhraseSet(GetPhraseSetRequest.newBuilder().setName(str).build());
    }

    public final PhraseSet getPhraseSet(GetPhraseSetRequest getPhraseSetRequest) {
        return getPhraseSetCallable().call(getPhraseSetRequest);
    }

    public final UnaryCallable<GetPhraseSetRequest, PhraseSet> getPhraseSetCallable() {
        return this.stub.getPhraseSetCallable();
    }

    public final ListPhraseSetPagedResponse listPhraseSet(LocationName locationName) {
        return listPhraseSet(ListPhraseSetRequest.newBuilder().setParent(locationName == null ? null : locationName.toString()).build());
    }

    public final ListPhraseSetPagedResponse listPhraseSet(String str) {
        return listPhraseSet(ListPhraseSetRequest.newBuilder().setParent(str).build());
    }

    public final ListPhraseSetPagedResponse listPhraseSet(ListPhraseSetRequest listPhraseSetRequest) {
        return listPhraseSetPagedCallable().call(listPhraseSetRequest);
    }

    public final UnaryCallable<ListPhraseSetRequest, ListPhraseSetPagedResponse> listPhraseSetPagedCallable() {
        return this.stub.listPhraseSetPagedCallable();
    }

    public final UnaryCallable<ListPhraseSetRequest, ListPhraseSetResponse> listPhraseSetCallable() {
        return this.stub.listPhraseSetCallable();
    }

    public final PhraseSet updatePhraseSet(UpdatePhraseSetRequest updatePhraseSetRequest) {
        return updatePhraseSetCallable().call(updatePhraseSetRequest);
    }

    public final UnaryCallable<UpdatePhraseSetRequest, PhraseSet> updatePhraseSetCallable() {
        return this.stub.updatePhraseSetCallable();
    }

    public final void deletePhraseSet(PhraseSetName phraseSetName) {
        deletePhraseSet(DeletePhraseSetRequest.newBuilder().setName(phraseSetName == null ? null : phraseSetName.toString()).build());
    }

    public final void deletePhraseSet(String str) {
        deletePhraseSet(DeletePhraseSetRequest.newBuilder().setName(str).build());
    }

    public final void deletePhraseSet(DeletePhraseSetRequest deletePhraseSetRequest) {
        deletePhraseSetCallable().call(deletePhraseSetRequest);
    }

    public final UnaryCallable<DeletePhraseSetRequest, Empty> deletePhraseSetCallable() {
        return this.stub.deletePhraseSetCallable();
    }

    public final CustomClass createCustomClass(LocationName locationName, CustomClass customClass, String str) {
        return createCustomClass(CreateCustomClassRequest.newBuilder().setParent(locationName == null ? null : locationName.toString()).setCustomClass(customClass).setCustomClassId(str).build());
    }

    public final CustomClass createCustomClass(String str, CustomClass customClass, String str2) {
        return createCustomClass(CreateCustomClassRequest.newBuilder().setParent(str).setCustomClass(customClass).setCustomClassId(str2).build());
    }

    public final CustomClass createCustomClass(CreateCustomClassRequest createCustomClassRequest) {
        return createCustomClassCallable().call(createCustomClassRequest);
    }

    public final UnaryCallable<CreateCustomClassRequest, CustomClass> createCustomClassCallable() {
        return this.stub.createCustomClassCallable();
    }

    public final CustomClass getCustomClass(CustomClassName customClassName) {
        return getCustomClass(GetCustomClassRequest.newBuilder().setName(customClassName == null ? null : customClassName.toString()).build());
    }

    public final CustomClass getCustomClass(String str) {
        return getCustomClass(GetCustomClassRequest.newBuilder().setName(str).build());
    }

    public final CustomClass getCustomClass(GetCustomClassRequest getCustomClassRequest) {
        return getCustomClassCallable().call(getCustomClassRequest);
    }

    public final UnaryCallable<GetCustomClassRequest, CustomClass> getCustomClassCallable() {
        return this.stub.getCustomClassCallable();
    }

    public final ListCustomClassesPagedResponse listCustomClasses(LocationName locationName) {
        return listCustomClasses(ListCustomClassesRequest.newBuilder().setParent(locationName == null ? null : locationName.toString()).build());
    }

    public final ListCustomClassesPagedResponse listCustomClasses(String str) {
        return listCustomClasses(ListCustomClassesRequest.newBuilder().setParent(str).build());
    }

    public final ListCustomClassesPagedResponse listCustomClasses(ListCustomClassesRequest listCustomClassesRequest) {
        return listCustomClassesPagedCallable().call(listCustomClassesRequest);
    }

    public final UnaryCallable<ListCustomClassesRequest, ListCustomClassesPagedResponse> listCustomClassesPagedCallable() {
        return this.stub.listCustomClassesPagedCallable();
    }

    public final UnaryCallable<ListCustomClassesRequest, ListCustomClassesResponse> listCustomClassesCallable() {
        return this.stub.listCustomClassesCallable();
    }

    public final CustomClass updateCustomClass(UpdateCustomClassRequest updateCustomClassRequest) {
        return updateCustomClassCallable().call(updateCustomClassRequest);
    }

    public final UnaryCallable<UpdateCustomClassRequest, CustomClass> updateCustomClassCallable() {
        return this.stub.updateCustomClassCallable();
    }

    public final void deleteCustomClass(CustomClassName customClassName) {
        deleteCustomClass(DeleteCustomClassRequest.newBuilder().setName(customClassName == null ? null : customClassName.toString()).build());
    }

    public final void deleteCustomClass(String str) {
        deleteCustomClass(DeleteCustomClassRequest.newBuilder().setName(str).build());
    }

    public final void deleteCustomClass(DeleteCustomClassRequest deleteCustomClassRequest) {
        deleteCustomClassCallable().call(deleteCustomClassRequest);
    }

    public final UnaryCallable<DeleteCustomClassRequest, Empty> deleteCustomClassCallable() {
        return this.stub.deleteCustomClassCallable();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.stub.close();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public void shutdown() {
        this.stub.shutdown();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean isShutdown() {
        return this.stub.isShutdown();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean isTerminated() {
        return this.stub.isTerminated();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public void shutdownNow() {
        this.stub.shutdownNow();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.stub.awaitTermination(j, timeUnit);
    }

    /* loaded from: classes7.dex */
    public static class ListPhraseSetPagedResponse extends AbstractPagedListResponse<ListPhraseSetRequest, ListPhraseSetResponse, PhraseSet, ListPhraseSetPage, ListPhraseSetFixedSizeCollection> {
        public static ApiFuture<ListPhraseSetPagedResponse> createAsync(PageContext<ListPhraseSetRequest, ListPhraseSetResponse, PhraseSet> pageContext, ApiFuture<ListPhraseSetResponse> apiFuture) {
            return ApiFutures.transform(ListPhraseSetPage.createEmptyPage().createPageAsync(pageContext, apiFuture), new ApiFunction<ListPhraseSetPage, ListPhraseSetPagedResponse>() { // from class: com.google.cloud.speech.v1p1beta1.AdaptationClient.ListPhraseSetPagedResponse.1
                @Override // com.google.api.core.ApiFunction
                public ListPhraseSetPagedResponse apply(ListPhraseSetPage listPhraseSetPage) {
                    return new ListPhraseSetPagedResponse(listPhraseSetPage);
                }
            }, MoreExecutors.directExecutor());
        }

        private ListPhraseSetPagedResponse(ListPhraseSetPage listPhraseSetPage) {
            super(listPhraseSetPage, ListPhraseSetFixedSizeCollection.createEmptyCollection());
        }
    }

    /* loaded from: classes7.dex */
    public static class ListPhraseSetPage extends AbstractPage<ListPhraseSetRequest, ListPhraseSetResponse, PhraseSet, ListPhraseSetPage> {
        private ListPhraseSetPage(PageContext<ListPhraseSetRequest, ListPhraseSetResponse, PhraseSet> pageContext, ListPhraseSetResponse listPhraseSetResponse) {
            super(pageContext, listPhraseSetResponse);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ListPhraseSetPage createEmptyPage() {
            return new ListPhraseSetPage(null, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.api.gax.paging.AbstractPage
        public ListPhraseSetPage createPage(PageContext<ListPhraseSetRequest, ListPhraseSetResponse, PhraseSet> pageContext, ListPhraseSetResponse listPhraseSetResponse) {
            return new ListPhraseSetPage(pageContext, listPhraseSetResponse);
        }

        @Override // com.google.api.gax.paging.AbstractPage
        public ApiFuture<ListPhraseSetPage> createPageAsync(PageContext<ListPhraseSetRequest, ListPhraseSetResponse, PhraseSet> pageContext, ApiFuture<ListPhraseSetResponse> apiFuture) {
            return super.createPageAsync(pageContext, apiFuture);
        }
    }

    /* loaded from: classes7.dex */
    public static class ListPhraseSetFixedSizeCollection extends AbstractFixedSizeCollection<ListPhraseSetRequest, ListPhraseSetResponse, PhraseSet, ListPhraseSetPage, ListPhraseSetFixedSizeCollection> {
        private ListPhraseSetFixedSizeCollection(List<ListPhraseSetPage> list, int i) {
            super(list, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ListPhraseSetFixedSizeCollection createEmptyCollection() {
            return new ListPhraseSetFixedSizeCollection(null, 0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.api.gax.paging.AbstractFixedSizeCollection
        public ListPhraseSetFixedSizeCollection createCollection(List<ListPhraseSetPage> list, int i) {
            return new ListPhraseSetFixedSizeCollection(list, i);
        }
    }

    /* loaded from: classes7.dex */
    public static class ListCustomClassesPagedResponse extends AbstractPagedListResponse<ListCustomClassesRequest, ListCustomClassesResponse, CustomClass, ListCustomClassesPage, ListCustomClassesFixedSizeCollection> {
        public static ApiFuture<ListCustomClassesPagedResponse> createAsync(PageContext<ListCustomClassesRequest, ListCustomClassesResponse, CustomClass> pageContext, ApiFuture<ListCustomClassesResponse> apiFuture) {
            return ApiFutures.transform(ListCustomClassesPage.createEmptyPage().createPageAsync(pageContext, apiFuture), new ApiFunction<ListCustomClassesPage, ListCustomClassesPagedResponse>() { // from class: com.google.cloud.speech.v1p1beta1.AdaptationClient.ListCustomClassesPagedResponse.1
                @Override // com.google.api.core.ApiFunction
                public ListCustomClassesPagedResponse apply(ListCustomClassesPage listCustomClassesPage) {
                    return new ListCustomClassesPagedResponse(listCustomClassesPage);
                }
            }, MoreExecutors.directExecutor());
        }

        private ListCustomClassesPagedResponse(ListCustomClassesPage listCustomClassesPage) {
            super(listCustomClassesPage, ListCustomClassesFixedSizeCollection.createEmptyCollection());
        }
    }

    /* loaded from: classes7.dex */
    public static class ListCustomClassesPage extends AbstractPage<ListCustomClassesRequest, ListCustomClassesResponse, CustomClass, ListCustomClassesPage> {
        private ListCustomClassesPage(PageContext<ListCustomClassesRequest, ListCustomClassesResponse, CustomClass> pageContext, ListCustomClassesResponse listCustomClassesResponse) {
            super(pageContext, listCustomClassesResponse);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ListCustomClassesPage createEmptyPage() {
            return new ListCustomClassesPage(null, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.api.gax.paging.AbstractPage
        public ListCustomClassesPage createPage(PageContext<ListCustomClassesRequest, ListCustomClassesResponse, CustomClass> pageContext, ListCustomClassesResponse listCustomClassesResponse) {
            return new ListCustomClassesPage(pageContext, listCustomClassesResponse);
        }

        @Override // com.google.api.gax.paging.AbstractPage
        public ApiFuture<ListCustomClassesPage> createPageAsync(PageContext<ListCustomClassesRequest, ListCustomClassesResponse, CustomClass> pageContext, ApiFuture<ListCustomClassesResponse> apiFuture) {
            return super.createPageAsync(pageContext, apiFuture);
        }
    }

    /* loaded from: classes7.dex */
    public static class ListCustomClassesFixedSizeCollection extends AbstractFixedSizeCollection<ListCustomClassesRequest, ListCustomClassesResponse, CustomClass, ListCustomClassesPage, ListCustomClassesFixedSizeCollection> {
        private ListCustomClassesFixedSizeCollection(List<ListCustomClassesPage> list, int i) {
            super(list, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ListCustomClassesFixedSizeCollection createEmptyCollection() {
            return new ListCustomClassesFixedSizeCollection(null, 0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.api.gax.paging.AbstractFixedSizeCollection
        public ListCustomClassesFixedSizeCollection createCollection(List<ListCustomClassesPage> list, int i) {
            return new ListCustomClassesFixedSizeCollection(list, i);
        }
    }
}
