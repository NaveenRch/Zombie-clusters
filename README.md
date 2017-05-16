# Zombie-clusters
Outputs group of identical zombies<br/>

Given a 2D array, for example:<br/>

<span>__z1 z2 z3 z4</span><br/>
z1 1  0  0  0<br/>
z2 0  1  1  0<br/>
z3 0  0  1  0<br/>
z4 0  0  0  1<br/>
Output should be groups of clusters:<br/>
Cluster 1: <z1><br/>
Cluster 2: <z2,z3> because z2z3=1<br/>
Cluster 3: <z4><br/>
Number of clusters: 3<br/>

Similarly<br/>
<span>__z1 z2 z3 z4</span><br/>
z1 1   0  0  0<br/>
z2 0  1  1  0<br/>
z3 0  0  1  0<br/>
z4 0  0  1  1<br/>
Output should be groups of clusters:<br/>
Cluster 1: <z1><br/>
Cluster 2: <z2,z3,z4> because z2z3=z3z4=1<br/>
Number of clusters: 2<br/>

Used bitset collection to implement the algorithm
