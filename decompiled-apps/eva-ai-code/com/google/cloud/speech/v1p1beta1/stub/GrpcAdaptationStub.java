package com.google.cloud.speech.v1p1beta1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.speech.v1p1beta1.AdaptationClient;
import com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest;
import com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequest;
import com.google.cloud.speech.v1p1beta1.CustomClass;
import com.google.cloud.speech.v1p1beta1.DeleteCustomClassRequest;
import com.google.cloud.speech.v1p1beta1.DeletePhraseSetRequest;
import com.google.cloud.speech.v1p1beta1.GetCustomClassRequest;
import com.google.cloud.speech.v1p1beta1.GetPhraseSetRequest;
import com.google.cloud.speech.v1p1beta1.ListCustomClassesRequest;
import com.google.cloud.speech.v1p1beta1.ListCustomClassesResponse;
import com.google.cloud.speech.v1p1beta1.ListPhraseSetRequest;
import com.google.cloud.speech.v1p1beta1.ListPhraseSetResponse;
import com.google.cloud.speech.v1p1beta1.PhraseSet;
import com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest;
import com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequest;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
@BetaApi
/* loaded from: classes7.dex */
public class GrpcAdaptationStub extends AdaptationStub {
    private final BackgroundResource backgroundResources;
    private final GrpcStubCallableFactory callableFactory;
    private final UnaryCallable<CreateCustomClassRequest, CustomClass> createCustomClassCallable;
    private final UnaryCallable<CreatePhraseSetRequest, PhraseSet> createPhraseSetCallable;
    private final UnaryCallable<DeleteCustomClassRequest, Empty> deleteCustomClassCallable;
    private final UnaryCallable<DeletePhraseSetRequest, Empty> deletePhraseSetCallable;
    private final UnaryCallable<GetCustomClassRequest, CustomClass> getCustomClassCallable;
    private final UnaryCallable<GetPhraseSetRequest, PhraseSet> getPhraseSetCallable;
    private final UnaryCallable<ListCustomClassesRequest, ListCustomClassesResponse> listCustomClassesCallable;
    private final UnaryCallable<ListCustomClassesRequest, AdaptationClient.ListCustomClassesPagedResponse> listCustomClassesPagedCallable;
    private final UnaryCallable<ListPhraseSetRequest, ListPhraseSetResponse> listPhraseSetCallable;
    private final UnaryCallable<ListPhraseSetRequest, AdaptationClient.ListPhraseSetPagedResponse> listPhraseSetPagedCallable;
    private final GrpcOperationsStub operationsStub;
    private final UnaryCallable<UpdateCustomClassRequest, CustomClass> updateCustomClassCallable;
    private final UnaryCallable<UpdatePhraseSetRequest, PhraseSet> updatePhraseSetCallable;
    private static final MethodDescriptor<CreatePhraseSetRequest, PhraseSet> createPhraseSetMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName("google.cloud.speech.v1p1beta1.Adaptation/CreatePhraseSet").setRequestMarshaller(ProtoUtils.marshaller(CreatePhraseSetRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(PhraseSet.getDefaultInstance())).build();
    private static final MethodDescriptor<GetPhraseSetRequest, PhraseSet> getPhraseSetMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName("google.cloud.speech.v1p1beta1.Adaptation/GetPhraseSet").setRequestMarshaller(ProtoUtils.marshaller(GetPhraseSetRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(PhraseSet.getDefaultInstance())).build();
    private static final MethodDescriptor<ListPhraseSetRequest, ListPhraseSetResponse> listPhraseSetMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName("google.cloud.speech.v1p1beta1.Adaptation/ListPhraseSet").setRequestMarshaller(ProtoUtils.marshaller(ListPhraseSetRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(ListPhraseSetResponse.getDefaultInstance())).build();
    private static final MethodDescriptor<UpdatePhraseSetRequest, PhraseSet> updatePhraseSetMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName("google.cloud.speech.v1p1beta1.Adaptation/UpdatePhraseSet").setRequestMarshaller(ProtoUtils.marshaller(UpdatePhraseSetRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(PhraseSet.getDefaultInstance())).build();
    private static final MethodDescriptor<DeletePhraseSetRequest, Empty> deletePhraseSetMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName("google.cloud.speech.v1p1beta1.Adaptation/DeletePhraseSet").setRequestMarshaller(ProtoUtils.marshaller(DeletePhraseSetRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance())).build();
    private static final MethodDescriptor<CreateCustomClassRequest, CustomClass> createCustomClassMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName("google.cloud.speech.v1p1beta1.Adaptation/CreateCustomClass").setRequestMarshaller(ProtoUtils.marshaller(CreateCustomClassRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(CustomClass.getDefaultInstance())).build();
    private static final MethodDescriptor<GetCustomClassRequest, CustomClass> getCustomClassMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName("google.cloud.speech.v1p1beta1.Adaptation/GetCustomClass").setRequestMarshaller(ProtoUtils.marshaller(GetCustomClassRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(CustomClass.getDefaultInstance())).build();
    private static final MethodDescriptor<ListCustomClassesRequest, ListCustomClassesResponse> listCustomClassesMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName("google.cloud.speech.v1p1beta1.Adaptation/ListCustomClasses").setRequestMarshaller(ProtoUtils.marshaller(ListCustomClassesRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(ListCustomClassesResponse.getDefaultInstance())).build();
    private static final MethodDescriptor<UpdateCustomClassRequest, CustomClass> updateCustomClassMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName("google.cloud.speech.v1p1beta1.Adaptation/UpdateCustomClass").setRequestMarshaller(ProtoUtils.marshaller(UpdateCustomClassRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(CustomClass.getDefaultInstance())).build();
    private static final MethodDescriptor<DeleteCustomClassRequest, Empty> deleteCustomClassMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName("google.cloud.speech.v1p1beta1.Adaptation/DeleteCustomClass").setRequestMarshaller(ProtoUtils.marshaller(DeleteCustomClassRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance())).build();

    public static final GrpcAdaptationStub create(AdaptationStubSettings adaptationStubSettings) throws IOException {
        return new GrpcAdaptationStub(adaptationStubSettings, ClientContext.create(adaptationStubSettings));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.cloud.speech.v1p1beta1.stub.AdaptationStubSettings] */
    public static final GrpcAdaptationStub create(ClientContext clientContext) throws IOException {
        return new GrpcAdaptationStub(AdaptationStubSettings.newBuilder().build(), clientContext);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.cloud.speech.v1p1beta1.stub.AdaptationStubSettings] */
    public static final GrpcAdaptationStub create(ClientContext clientContext, GrpcStubCallableFactory grpcStubCallableFactory) throws IOException {
        return new GrpcAdaptationStub(AdaptationStubSettings.newBuilder().build(), clientContext, grpcStubCallableFactory);
    }

    protected GrpcAdaptationStub(AdaptationStubSettings adaptationStubSettings, ClientContext clientContext) throws IOException {
        this(adaptationStubSettings, clientContext, new GrpcAdaptationCallableFactory());
    }

    protected GrpcAdaptationStub(AdaptationStubSettings adaptationStubSettings, ClientContext clientContext, GrpcStubCallableFactory grpcStubCallableFactory) throws IOException {
        this.callableFactory = grpcStubCallableFactory;
        this.operationsStub = GrpcOperationsStub.create(clientContext, grpcStubCallableFactory);
        GrpcCallSettings build = GrpcCallSettings.newBuilder().setMethodDescriptor(createPhraseSetMethodDescriptor).setParamsExtractor(new RequestParamsExtractor<CreatePhraseSetRequest>() { // from class: com.google.cloud.speech.v1p1beta1.stub.GrpcAdaptationStub.1
            @Override // com.google.api.gax.rpc.RequestParamsExtractor
            public Map<String, String> extract(CreatePhraseSetRequest createPhraseSetRequest) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("parent", String.valueOf(createPhraseSetRequest.getParent()));
                return builder.build();
            }
        }).build();
        GrpcCallSettings build2 = GrpcCallSettings.newBuilder().setMethodDescriptor(getPhraseSetMethodDescriptor).setParamsExtractor(new RequestParamsExtractor<GetPhraseSetRequest>() { // from class: com.google.cloud.speech.v1p1beta1.stub.GrpcAdaptationStub.2
            @Override // com.google.api.gax.rpc.RequestParamsExtractor
            public Map<String, String> extract(GetPhraseSetRequest getPhraseSetRequest) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("name", String.valueOf(getPhraseSetRequest.getName()));
                return builder.build();
            }
        }).build();
        GrpcCallSettings build3 = GrpcCallSettings.newBuilder().setMethodDescriptor(listPhraseSetMethodDescriptor).setParamsExtractor(new RequestParamsExtractor<ListPhraseSetRequest>() { // from class: com.google.cloud.speech.v1p1beta1.stub.GrpcAdaptationStub.3
            @Override // com.google.api.gax.rpc.RequestParamsExtractor
            public Map<String, String> extract(ListPhraseSetRequest listPhraseSetRequest) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("parent", String.valueOf(listPhraseSetRequest.getParent()));
                return builder.build();
            }
        }).build();
        GrpcCallSettings build4 = GrpcCallSettings.newBuilder().setMethodDescriptor(updatePhraseSetMethodDescriptor).setParamsExtractor(new RequestParamsExtractor<UpdatePhraseSetRequest>() { // from class: com.google.cloud.speech.v1p1beta1.stub.GrpcAdaptationStub.4
            @Override // com.google.api.gax.rpc.RequestParamsExtractor
            public Map<String, String> extract(UpdatePhraseSetRequest updatePhraseSetRequest) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("phrase_set.name", String.valueOf(updatePhraseSetRequest.getPhraseSet().getName()));
                return builder.build();
            }
        }).build();
        GrpcCallSettings build5 = GrpcCallSettings.newBuilder().setMethodDescriptor(deletePhraseSetMethodDescriptor).setParamsExtractor(new RequestParamsExtractor<DeletePhraseSetRequest>() { // from class: com.google.cloud.speech.v1p1beta1.stub.GrpcAdaptationStub.5
            @Override // com.google.api.gax.rpc.RequestParamsExtractor
            public Map<String, String> extract(DeletePhraseSetRequest deletePhraseSetRequest) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("name", String.valueOf(deletePhraseSetRequest.getName()));
                return builder.build();
            }
        }).build();
        GrpcCallSettings build6 = GrpcCallSettings.newBuilder().setMethodDescriptor(createCustomClassMethodDescriptor).setParamsExtractor(new RequestParamsExtractor<CreateCustomClassRequest>() { // from class: com.google.cloud.speech.v1p1beta1.stub.GrpcAdaptationStub.6
            @Override // com.google.api.gax.rpc.RequestParamsExtractor
            public Map<String, String> extract(CreateCustomClassRequest createCustomClassRequest) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("parent", String.valueOf(createCustomClassRequest.getParent()));
                return builder.build();
            }
        }).build();
        GrpcCallSettings build7 = GrpcCallSettings.newBuilder().setMethodDescriptor(getCustomClassMethodDescriptor).setParamsExtractor(new RequestParamsExtractor<GetCustomClassRequest>() { // from class: com.google.cloud.speech.v1p1beta1.stub.GrpcAdaptationStub.7
            @Override // com.google.api.gax.rpc.RequestParamsExtractor
            public Map<String, String> extract(GetCustomClassRequest getCustomClassRequest) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("name", String.valueOf(getCustomClassRequest.getName()));
                return builder.build();
            }
        }).build();
        GrpcCallSettings build8 = GrpcCallSettings.newBuilder().setMethodDescriptor(listCustomClassesMethodDescriptor).setParamsExtractor(new RequestParamsExtractor<ListCustomClassesRequest>() { // from class: com.google.cloud.speech.v1p1beta1.stub.GrpcAdaptationStub.8
            @Override // com.google.api.gax.rpc.RequestParamsExtractor
            public Map<String, String> extract(ListCustomClassesRequest listCustomClassesRequest) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("parent", String.valueOf(listCustomClassesRequest.getParent()));
                return builder.build();
            }
        }).build();
        GrpcCallSettings build9 = GrpcCallSettings.newBuilder().setMethodDescriptor(updateCustomClassMethodDescriptor).setParamsExtractor(new RequestParamsExtractor<UpdateCustomClassRequest>() { // from class: com.google.cloud.speech.v1p1beta1.stub.GrpcAdaptationStub.9
            @Override // com.google.api.gax.rpc.RequestParamsExtractor
            public Map<String, String> extract(UpdateCustomClassRequest updateCustomClassRequest) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("custom_class.name", String.valueOf(updateCustomClassRequest.getCustomClass().getName()));
                return builder.build();
            }
        }).build();
        GrpcCallSettings build10 = GrpcCallSettings.newBuilder().setMethodDescriptor(deleteCustomClassMethodDescriptor).setParamsExtractor(new RequestParamsExtractor<DeleteCustomClassRequest>() { // from class: com.google.cloud.speech.v1p1beta1.stub.GrpcAdaptationStub.10
            @Override // com.google.api.gax.rpc.RequestParamsExtractor
            public Map<String, String> extract(DeleteCustomClassRequest deleteCustomClassRequest) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("name", String.valueOf(deleteCustomClassRequest.getName()));
                return builder.build();
            }
        }).build();
        this.createPhraseSetCallable = grpcStubCallableFactory.createUnaryCallable(build, adaptationStubSettings.createPhraseSetSettings(), clientContext);
        this.getPhraseSetCallable = grpcStubCallableFactory.createUnaryCallable(build2, adaptationStubSettings.getPhraseSetSettings(), clientContext);
        this.listPhraseSetCallable = grpcStubCallableFactory.createUnaryCallable(build3, adaptationStubSettings.listPhraseSetSettings(), clientContext);
        this.listPhraseSetPagedCallable = grpcStubCallableFactory.createPagedCallable(build3, adaptationStubSettings.listPhraseSetSettings(), clientContext);
        this.updatePhraseSetCallable = grpcStubCallableFactory.createUnaryCallable(build4, adaptationStubSettings.updatePhraseSetSettings(), clientContext);
        this.deletePhraseSetCallable = grpcStubCallableFactory.createUnaryCallable(build5, adaptationStubSettings.deletePhraseSetSettings(), clientContext);
        this.createCustomClassCallable = grpcStubCallableFactory.createUnaryCallable(build6, adaptationStubSettings.createCustomClassSettings(), clientContext);
        this.getCustomClassCallable = grpcStubCallableFactory.createUnaryCallable(build7, adaptationStubSettings.getCustomClassSettings(), clientContext);
        this.listCustomClassesCallable = grpcStubCallableFactory.createUnaryCallable(build8, adaptationStubSettings.listCustomClassesSettings(), clientContext);
        this.listCustomClassesPagedCallable = grpcStubCallableFactory.createPagedCallable(build8, adaptationStubSettings.listCustomClassesSettings(), clientContext);
        this.updateCustomClassCallable = grpcStubCallableFactory.createUnaryCallable(build9, adaptationStubSettings.updateCustomClassSettings(), clientContext);
        this.deleteCustomClassCallable = grpcStubCallableFactory.createUnaryCallable(build10, adaptationStubSettings.deleteCustomClassSettings(), clientContext);
        this.backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
    }

    public GrpcOperationsStub getOperationsStub() {
        return this.operationsStub;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub
    public UnaryCallable<CreatePhraseSetRequest, PhraseSet> createPhraseSetCallable() {
        return this.createPhraseSetCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub
    public UnaryCallable<GetPhraseSetRequest, PhraseSet> getPhraseSetCallable() {
        return this.getPhraseSetCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub
    public UnaryCallable<ListPhraseSetRequest, ListPhraseSetResponse> listPhraseSetCallable() {
        return this.listPhraseSetCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub
    public UnaryCallable<ListPhraseSetRequest, AdaptationClient.ListPhraseSetPagedResponse> listPhraseSetPagedCallable() {
        return this.listPhraseSetPagedCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub
    public UnaryCallable<UpdatePhraseSetRequest, PhraseSet> updatePhraseSetCallable() {
        return this.updatePhraseSetCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub
    public UnaryCallable<DeletePhraseSetRequest, Empty> deletePhraseSetCallable() {
        return this.deletePhraseSetCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub
    public UnaryCallable<CreateCustomClassRequest, CustomClass> createCustomClassCallable() {
        return this.createCustomClassCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub
    public UnaryCallable<GetCustomClassRequest, CustomClass> getCustomClassCallable() {
        return this.getCustomClassCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub
    public UnaryCallable<ListCustomClassesRequest, ListCustomClassesResponse> listCustomClassesCallable() {
        return this.listCustomClassesCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub
    public UnaryCallable<ListCustomClassesRequest, AdaptationClient.ListCustomClassesPagedResponse> listCustomClassesPagedCallable() {
        return this.listCustomClassesPagedCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub
    public UnaryCallable<UpdateCustomClassRequest, CustomClass> updateCustomClassCallable() {
        return this.updateCustomClassCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub
    public UnaryCallable<DeleteCustomClassRequest, Empty> deleteCustomClassCallable() {
        return this.deleteCustomClassCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.AdaptationStub, java.lang.AutoCloseable
    public final void close() {
        shutdown();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public void shutdown() {
        this.backgroundResources.shutdown();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean isShutdown() {
        return this.backgroundResources.isShutdown();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean isTerminated() {
        return this.backgroundResources.isTerminated();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public void shutdownNow() {
        this.backgroundResources.shutdownNow();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.backgroundResources.awaitTermination(j, timeUnit);
    }
}
