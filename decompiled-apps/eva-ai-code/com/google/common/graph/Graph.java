package com.google.common.graph;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;
import javax.annotation.CheckForNull;
@DoNotMock("Use GraphBuilder to create a real instance")
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public interface Graph<N> extends BaseGraph<N> {
    @Override // 
    Set<N> adjacentNodes(N n);

    @Override // 
    boolean allowsSelfLoops();

    @Override // com.google.common.graph.BaseGraph
    int degree(N n);

    @Override // com.google.common.graph.BaseGraph
    Set<EndpointPair<N>> edges();

    boolean equals(@CheckForNull Object obj);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(EndpointPair<N> endpointPair);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(N n, N n2);

    int hashCode();

    @Override // com.google.common.graph.BaseGraph
    int inDegree(N n);

    @Override // com.google.common.graph.BaseGraph
    ElementOrder<N> incidentEdgeOrder();

    @Override // com.google.common.graph.BaseGraph
    Set<EndpointPair<N>> incidentEdges(N n);

    @Override // 
    boolean isDirected();

    @Override // 
    ElementOrder<N> nodeOrder();

    @Override // 
    Set<N> nodes();

    @Override // com.google.common.graph.BaseGraph
    int outDegree(N n);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    Set<N> predecessors(N n);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    Set<N> successors(N n);

    /* renamed from: com.google.common.graph.Graph$-CC  reason: invalid class name */
    /* loaded from: classes7.dex */
    public final /* synthetic */ class CC {
    }
}
