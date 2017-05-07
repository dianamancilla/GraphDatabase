
package graphdatabase;


public final class interfaz extends javax.swing.JFrame {
SUCURSAL CualquierBanco = new SUCURSAL("Bancomer","BBVA");
		SUCURSAL mexico = new SUCURSAL("MEXICO", "MEX");
		SUCURSAL gdl = new SUCURSAL("GUADALAJARA", "GDL");
		SUCURSAL pue = new SUCURSAL("PUEBLA", "PUE");
		SUCURSAL qro = new SUCURSAL("QUERETARO", "QRO");
		
		GERENTE m1 = new GERENTE("Paula", "M1", mexico);
		GERENTE m2 = new GERENTE("Martin", "M2", mexico);
		GERENTE g1 = new GERENTE("Daniel", "G1", gdl);
		GERENTE g2 = new GERENTE("Oswaldo", "G2", gdl);
		GERENTE p1 = new GERENTE("Bruno", "P1", pue);
		GERENTE p2 = new GERENTE("Brenda", "P2", pue);
		GERENTE q1 = new GERENTE("Fernanda", "Q1", qro);
		GERENTE q2 = new GERENTE("Susan", "Q2", qro);		
		
		EMPLEADO m11 = new EMPLEADO("Lucia", "Mex1-1", m1);
		EMPLEADO m12 = new EMPLEADO("Mario", "Mex1-2", m1);
		EMPLEADO m13 = new EMPLEADO("Josue", "Mex1-3", m1);
		EMPLEADO m21 = new EMPLEADO("Adrian", "Mex2-1", m2);
		EMPLEADO m22 = new EMPLEADO("Luisa", "Mex2-2", m2);
		EMPLEADO m23 = new EMPLEADO("Gerardo", "Mex2-3", m2);
		EMPLEADO g11 = new EMPLEADO("Arnoldo", "Gdl1-1", g1);
		EMPLEADO g12 = new EMPLEADO("Maria", "Gdl1-2", g1);
		EMPLEADO g13 = new EMPLEADO("Guillermo", "Gdl1-3", g1);
		EMPLEADO g21 = new EMPLEADO("Ricardo", "Gdl2-1", g2);
		EMPLEADO g22 = new EMPLEADO("Gloria", "Gdl2-2", g2);
		EMPLEADO g23 = new EMPLEADO("Santiago", "Gdl2-3", g2);
		EMPLEADO p11 = new EMPLEADO("Berbara", "Pue1-1", p1);
		EMPLEADO p12 = new EMPLEADO("Bernardo", "Pue1-2", p1);
		EMPLEADO p13 = new EMPLEADO("Gilberto", "Pue1-3", p1);
		EMPLEADO p21 = new EMPLEADO("Jesus", "Pue2-1", p2);
		EMPLEADO p22 = new EMPLEADO("Pablo", "Pue2-2", p2);
		EMPLEADO p23 = new EMPLEADO("Francisco", "Pue2-3", p2);
		EMPLEADO q11 = new EMPLEADO("Ernesto", "Qro1-1", q1);
		EMPLEADO q12 = new EMPLEADO("Renata", "Qro1-2", q1);
		EMPLEADO q13 = new EMPLEADO("Alejandra", "Qro1-3", q1);
		EMPLEADO q21 = new EMPLEADO("Carlos", "Qro2-1", q2);
		EMPLEADO q22 = new EMPLEADO("Alonso", "Qro2-2", q2);
		EMPLEADO q23 = new EMPLEADO("Tomas", "Qro2-3", q2);
		
		CLIENTE m111 = new CLIENTE("aor","2",m11);
		CLIENTE m112 = new CLIENTE("aar","3",m11);
		CLIENTE m113 = new CLIENTE("aer","4",m11);
		CLIENTE m121 = new CLIENTE("ate","5",m12);
		CLIENTE m122 = new CLIENTE("are","6",m12);
		CLIENTE m123 = new CLIENTE("ail","7",m12);
		CLIENTE m131 = new CLIENTE("aar","8",m13);
		CLIENTE m132 = new CLIENTE("aie","9",m13);
		CLIENTE m133 = new CLIENTE("aay","10",m13);
		
		CLIENTE m211 = new CLIENTE("bor","11",m21);
		CLIENTE m212 = new CLIENTE("bar","12",m21);
		CLIENTE m213 = new CLIENTE("ber","13",m21);
		CLIENTE m221 = new CLIENTE("bte","14",m22);
		CLIENTE m222 = new CLIENTE("bre","15",m22);
		CLIENTE m223 = new CLIENTE("bil","16",m22);
		CLIENTE m231 = new CLIENTE("bar","17",m23);
		CLIENTE m232 = new CLIENTE("bie","18",m23);
		CLIENTE m233 = new CLIENTE("bay","19",m23);
		
		CLIENTE g111 = new CLIENTE("cer","20",g11);
		CLIENTE g112 = new CLIENTE("cac","21",g11);
		CLIENTE g113 = new CLIENTE("cen","22",g11);
		CLIENTE g121 = new CLIENTE("cos","23",g12);
		CLIENTE g122 = new CLIENTE("cil","24",g12);
		CLIENTE g123 = new CLIENTE("cui","25",g12);
		CLIENTE g131 = new CLIENTE("cav","26",g13);
		CLIENTE g132 = new CLIENTE("cel","27",g13);
		CLIENTE g133 = new CLIENTE("cet","28",g13);
	
		CLIENTE g211 = new CLIENTE("der","29",g21);
		CLIENTE g212 = new CLIENTE("daa","30",g21);
		CLIENTE g213 = new CLIENTE("dir","31",g21);
		CLIENTE g221 = new CLIENTE("der","32",g22);
		CLIENTE g222 = new CLIENTE("daa","33",g22);
		CLIENTE g223 = new CLIENTE("dir","34",g22);
		CLIENTE g231 = new CLIENTE("der","35",g23);
		CLIENTE g232 = new CLIENTE("daa","36",g23);
		CLIENTE g233 = new CLIENTE("dir","37",g23);
		
		CLIENTE p111 = new CLIENTE("eer","38",p11);
		CLIENTE p112 = new CLIENTE("eaa","39",p11);
		CLIENTE p113 = new CLIENTE("eir","40",p11);
		CLIENTE p121 = new CLIENTE("eer","41",p12);
		CLIENTE p122 = new CLIENTE("eaa","42",p12);
		CLIENTE p123 = new CLIENTE("eir","43",p12);
		CLIENTE p131 = new CLIENTE("eer","44",p13);
		CLIENTE p132 = new CLIENTE("eaa","45",p13);
		CLIENTE p133 = new CLIENTE("eir","46",p13);
		
		CLIENTE p211 = new CLIENTE("fer","47",p21);
		CLIENTE p212 = new CLIENTE("faa","48",p21);
		CLIENTE p213 = new CLIENTE("fir","49",p21);
		CLIENTE p221 = new CLIENTE("fer","50",p22);
		CLIENTE p222 = new CLIENTE("faa","51",p22);
		CLIENTE p223 = new CLIENTE("fir","52",p22);
		CLIENTE p231 = new CLIENTE("fer","53",p23);
		CLIENTE p232 = new CLIENTE("faa","54",p23);
		CLIENTE p233 = new CLIENTE("fir","55",p23);
		
		CLIENTE q111 = new CLIENTE("ger","56",q11);
		CLIENTE q112 = new CLIENTE("gaa","57",q11);
		CLIENTE q113 = new CLIENTE("gir","58",q11);
		CLIENTE q121 = new CLIENTE("ger","59",q12);
		CLIENTE q122 = new CLIENTE("gaa","60",q12);
		CLIENTE q123 = new CLIENTE("gir","61",q12);
		CLIENTE q131 = new CLIENTE("ger","62",q13);
		CLIENTE q132 = new CLIENTE("gaa","63",q13);
		CLIENTE q133 = new CLIENTE("gir","64",q13);
		
		CLIENTE q211 = new CLIENTE("her","65",q21);
		CLIENTE q212 = new CLIENTE("haa","66",q21);
		CLIENTE q213 = new CLIENTE("hir","67",q21);
		CLIENTE q221 = new CLIENTE("her","68",q22);
		CLIENTE q222 = new CLIENTE("haa","69",q22);
		CLIENTE q223 = new CLIENTE("hir","70",q22);
		CLIENTE q231 = new CLIENTE("her","71",q23);
		CLIENTE q232 = new CLIENTE("haa","72",q23);
		CLIENTE q233 = new CLIENTE("hir","73",q23);
		
		PRESTAMO z1 = new PRESTAMO("","1",m111);
		PRESTAMO z2 = new PRESTAMO("","2",m112);
		PRESTAMO z3 = new PRESTAMO("","3",m113);
		PRESTAMO z4 = new PRESTAMO("","4",m121);
		PRESTAMO z5 = new PRESTAMO("","5",m122);
		PRESTAMO z6 = new PRESTAMO("","6",m123);
		PRESTAMO z7 = new PRESTAMO("","7",m131);
		PRESTAMO z8 = new PRESTAMO("","8",m132);
		PRESTAMO z9 = new PRESTAMO("","9",m133);
		
		PRESTAMO z10 = new PRESTAMO("","10",m211);
		PRESTAMO z11 = new PRESTAMO("","11",m212);
		PRESTAMO z12 = new PRESTAMO("","12",m213);
		PRESTAMO z13 = new PRESTAMO("","13",m221);
		PRESTAMO z14 = new PRESTAMO("","14",m222);
		PRESTAMO z15 = new PRESTAMO("","15",m223);
		PRESTAMO z16 = new PRESTAMO("","16",m231);
		PRESTAMO z17 = new PRESTAMO("","17",m232);
		PRESTAMO z18 = new PRESTAMO("","18",m233);
		
		PRESTAMO z19 = new PRESTAMO("","19",g111);
		PRESTAMO z20 = new PRESTAMO("","20",g112);
		PRESTAMO z21 = new PRESTAMO("","21",g113);
		PRESTAMO z22 = new PRESTAMO("","22",g121);
		PRESTAMO z23 = new PRESTAMO("","23",g122);
		PRESTAMO z24 = new PRESTAMO("","24",g123);
		PRESTAMO z25 = new PRESTAMO("","25",g131);
		PRESTAMO z26 = new PRESTAMO("","26",g132);
		PRESTAMO z27 = new PRESTAMO("","27",g133);
		
		PRESTAMO z28 = new PRESTAMO("","28",g211);
		PRESTAMO z29 = new PRESTAMO("","29",g212);
		PRESTAMO z30 = new PRESTAMO("","30",g213);
		PRESTAMO z31 = new PRESTAMO("","31",g221);
		PRESTAMO z32 = new PRESTAMO("","32",g222);
		PRESTAMO z33 = new PRESTAMO("","33",g223);
		PRESTAMO z34 = new PRESTAMO("","34",g231);
		PRESTAMO z35 = new PRESTAMO("","35",g232);
		PRESTAMO z36 = new PRESTAMO("","36",g233);
		
		PRESTAMO z37 = new PRESTAMO("","37",p111);
		PRESTAMO z38 = new PRESTAMO("","38",p112);
		PRESTAMO z39 = new PRESTAMO("","39",p113);
		PRESTAMO z40 = new PRESTAMO("","40",p121);
		PRESTAMO z41 = new PRESTAMO("","41",p122);
		PRESTAMO z42 = new PRESTAMO("","42",p123);
		PRESTAMO z43 = new PRESTAMO("","43",p131);
		PRESTAMO z44 = new PRESTAMO("","44",p132);
		PRESTAMO z45 = new PRESTAMO("","45",p133);
		
		PRESTAMO z46 = new PRESTAMO("","46",p211);
		PRESTAMO z47 = new PRESTAMO("","47",p212);
		PRESTAMO z48 = new PRESTAMO("","48",p213);
		PRESTAMO z49 = new PRESTAMO("","49",p221);
		PRESTAMO z50 = new PRESTAMO("","50",p222);
		PRESTAMO z51 = new PRESTAMO("","51",p223);
		PRESTAMO z52 = new PRESTAMO("","52",p231);
		PRESTAMO z53 = new PRESTAMO("","53",p232);
		PRESTAMO z54 = new PRESTAMO("","54",p233);
		
		PRESTAMO z55 = new PRESTAMO("","55",q111);
		PRESTAMO z56 = new PRESTAMO("","56",q112);
		PRESTAMO z57 = new PRESTAMO("","57",q113);
		PRESTAMO z58 = new PRESTAMO("","58",q121);
		PRESTAMO z59 = new PRESTAMO("","59",q122);
		PRESTAMO z60 = new PRESTAMO("","60",q123);
		PRESTAMO z61 = new PRESTAMO("","61",q131);
		PRESTAMO z62 = new PRESTAMO("","62",q132);
		PRESTAMO z63 = new PRESTAMO("","63",q133);
		
		PRESTAMO z64 = new PRESTAMO("","64",q211);
		PRESTAMO z65 = new PRESTAMO("","65",q212);
		PRESTAMO z66 = new PRESTAMO("","66",q213);
		PRESTAMO z67 = new PRESTAMO("","67",q221);
		PRESTAMO z68 = new PRESTAMO("","68",q222);
		PRESTAMO z69 = new PRESTAMO("","69",q223);
		PRESTAMO z70 = new PRESTAMO("","70",q231);
		PRESTAMO z71 = new PRESTAMO("","71",q232);
		PRESTAMO z72 = new PRESTAMO("","72",q233);
                
        DirWeightGraph<SUCURSAL> graph1 = new DirWeightGraph<>(300); 
        
        public void graph(){
            
                graph1.addVertex(CualquierBanco); //Banco --------- banco&sucursales
                graph1.addVertex(mexico);//Sucursales
		graph1.addVertex(gdl);
		graph1.addVertex(pue);		//sucursales&gerentes
		graph1.addVertex(qro);
                graph1.addVertex(m1);//Gerentes Mexico
		graph1.addVertex(m2);
                
                graph1.addVertex(g1);//Gerentes Guadalajara
		graph1.addVertex(g2);
		graph1.addVertex(p1);//Gerentes Puebla
		graph1.addVertex(p2);
		graph1.addVertex(q1);//Gerentes Queretaro
		graph1.addVertex(q2);
                
                graph1.addVertex(m11);//Empleados
		graph1.addVertex(m12);
		graph1.addVertex(m13);
		graph1.addVertex(m21);
		graph1.addVertex(m22);
		graph1.addVertex(m23);
		graph1.addVertex(g11);
		graph1.addVertex(g12);
		graph1.addVertex(g13);
		graph1.addVertex(g21);
		graph1.addVertex(g22);			
		graph1.addVertex(g23);
		graph1.addVertex(p11);
		graph1.addVertex(p12);
		graph1.addVertex(p13);
		graph1.addVertex(p21);
		graph1.addVertex(p22);
		graph1.addVertex(p23);
		graph1.addVertex(q11);
		graph1.addVertex(q12);
		graph1.addVertex(q13);
		graph1.addVertex(q21);
		graph1.addVertex(q22);
		graph1.addVertex(q23);
                
                graph1.addVertex(m111);//Clientes
		graph1.addVertex(m112);
		graph1.addVertex(m113);
		graph1.addVertex(m121);
		graph1.addVertex(m122);
		graph1.addVertex(m123);
		graph1.addVertex(m131);
		graph1.addVertex(m132);
		graph1.addVertex(m133);
		graph1.addVertex(m211);
		graph1.addVertex(m212);
		graph1.addVertex(m213);
		graph1.addVertex(m221);
		graph1.addVertex(m222);
		graph1.addVertex(m223);
		graph1.addVertex(m231);
		graph1.addVertex(m232);
		graph1.addVertex(m233);
		graph1.addVertex(g111);
		graph1.addVertex(g112);
		graph1.addVertex(g113);
		graph1.addVertex(g121);
		graph1.addVertex(g122);
		graph1.addVertex(g123);
		graph1.addVertex(g131);
		graph1.addVertex(g132);
		graph1.addVertex(g133);
		graph1.addVertex(g211);
		graph1.addVertex(g212);
		graph1.addVertex(g213);
		graph1.addVertex(g221);
		graph1.addVertex(g222);
		graph1.addVertex(g223);
		graph1.addVertex(g231);
		graph1.addVertex(g232);
		graph1.addVertex(g233);
		graph1.addVertex(p111);
		graph1.addVertex(p112);
		graph1.addVertex(p113);
		graph1.addVertex(p121);
		graph1.addVertex(p122);
		graph1.addVertex(p123);
		graph1.addVertex(p131);
		graph1.addVertex(p132);
		graph1.addVertex(p133);
		graph1.addVertex(p211);
		graph1.addVertex(p212);
		graph1.addVertex(p213);
		graph1.addVertex(p221);
		graph1.addVertex(p222);
		graph1.addVertex(p223);
		graph1.addVertex(p231);
		graph1.addVertex(p232);
		graph1.addVertex(p233);
		graph1.addVertex(q111);
		graph1.addVertex(q112);
		graph1.addVertex(q113);
		graph1.addVertex(q121);
		graph1.addVertex(q122);
		graph1.addVertex(q123);
		graph1.addVertex(q131);
		graph1.addVertex(q132);
		graph1.addVertex(q133);
		graph1.addVertex(q211);
		graph1.addVertex(q212);
		graph1.addVertex(q213);
		graph1.addVertex(q221);
		graph1.addVertex(q222);
		graph1.addVertex(q223);
		graph1.addVertex(q231);
		graph1.addVertex(q232);
		graph1.addVertex(q233);
                
                graph1.addVertex(z1);//Prestamos
		graph1.addVertex(z2);
		graph1.addVertex(z3);
		graph1.addVertex(z4);
		graph1.addVertex(z5);
		graph1.addVertex(z6);
		graph1.addVertex(z7);
		graph1.addVertex(z8);
		graph1.addVertex(z9);
		graph1.addVertex(z10);
		graph1.addVertex(z11);
		graph1.addVertex(z12);
		graph1.addVertex(z13);
		graph1.addVertex(z14);
		graph1.addVertex(z15);
		graph1.addVertex(z16);
		graph1.addVertex(z17);
		graph1.addVertex(z18);
		graph1.addVertex(z19);
		graph1.addVertex(z20);
		graph1.addVertex(z21);
		graph1.addVertex(z22);
		graph1.addVertex(z23);
		graph1.addVertex(z24);
		graph1.addVertex(z25);
		graph1.addVertex(z26);
		graph1.addVertex(z27);
		graph1.addVertex(z28);
		graph1.addVertex(z29);
		graph1.addVertex(z30);
		graph1.addVertex(z31);
		graph1.addVertex(z32);
		graph1.addVertex(z33);
		graph1.addVertex(z34);
		graph1.addVertex(z35);
		graph1.addVertex(z36);
		graph1.addVertex(z37);
		graph1.addVertex(z38);
		graph1.addVertex(z39);
		graph1.addVertex(z40);
		graph1.addVertex(z41);
		graph1.addVertex(z42);
		graph1.addVertex(z43);
		graph1.addVertex(z44);
		graph1.addVertex(z45);
		graph1.addVertex(z46);
		graph1.addVertex(z47);
		graph1.addVertex(z48);
		graph1.addVertex(z49);
		graph1.addVertex(z50);
		graph1.addVertex(z51);
		graph1.addVertex(z52);
		graph1.addVertex(z53);
		graph1.addVertex(z54);
		graph1.addVertex(z55);
		graph1.addVertex(z56);
		graph1.addVertex(z57);
		graph1.addVertex(z58);
		graph1.addVertex(z59);
		graph1.addVertex(z60);
		graph1.addVertex(z61);
		graph1.addVertex(z62);
		graph1.addVertex(z63);
		graph1.addVertex(z64);
		graph1.addVertex(z65);
		graph1.addVertex(z66);
		graph1.addVertex(z67);
		graph1.addVertex(z68);
		graph1.addVertex(z69);
		graph1.addVertex(z70);
		graph1.addVertex(z71);
		graph1.addVertex(z72);
        
        }
        
        
        
      public void edges(){
                graph1.addEdge(CualquierBanco, mexico, 1);
		graph1.addEdge(CualquierBanco, gdl, 1);
		graph1.addEdge(CualquierBanco, pue, 1);
		graph1.addEdge(CualquierBanco, qro, 1);
		
		graph1.addEdge(mexico, m1, 2);
		graph1.addEdge(mexico, m2, 2);
		graph1.addEdge(gdl, g1, 2);
		graph1.addEdge(gdl, g2, 2);
		graph1.addEdge(pue, p1, 2);
		graph1.addEdge(pue, p2, 2);
		graph1.addEdge(qro, q1, 2);
		graph1.addEdge(qro, q2, 2);
		
		graph1.addEdge(m1, m11, 3);
		graph1.addEdge(m1, m12, 3);
		graph1.addEdge(m1, m13, 3);
		graph1.addEdge(m2, m21, 3);
		graph1.addEdge(m2, m22, 3);
		graph1.addEdge(m2, m23, 3);
		graph1.addEdge(g1, g11, 3);
		graph1.addEdge(g1, g12, 3);
		graph1.addEdge(g1, g13, 3);
		graph1.addEdge(g2, g21, 3);
		graph1.addEdge(g2, g22, 3);
		graph1.addEdge(g2, g23, 3);
		graph1.addEdge(p1, p11, 3);
		graph1.addEdge(p1, p12, 3);
		graph1.addEdge(p1, p13, 3);
		graph1.addEdge(p2, p21, 3);
		graph1.addEdge(p2, p22, 3);
		graph1.addEdge(p2, p23, 3);
		graph1.addEdge(q1, q11, 3);
		graph1.addEdge(q1, q12, 3);
		graph1.addEdge(q1, q13, 3);
		graph1.addEdge(q2, q21, 3);
		graph1.addEdge(q2, q22, 3);
		graph1.addEdge(q2, q23, 3);
		
		graph1.addEdge(m11, m111, 4);
		graph1.addEdge(m11, m112, 4);
		graph1.addEdge(m11, m113, 4);
		graph1.addEdge(m12, m121, 4);
		graph1.addEdge(m12, m122, 4);
		graph1.addEdge(m12, m123, 4);
		graph1.addEdge(m13, m131, 4);
		graph1.addEdge(m13, m132, 4);
		graph1.addEdge(m13, m133, 4);
		graph1.addEdge(m21, m211, 4);
		graph1.addEdge(m21, m212, 4);
		graph1.addEdge(m21, m213, 4);
		graph1.addEdge(m22, m221, 4);
		graph1.addEdge(m22, m222, 4);
		graph1.addEdge(m22, m223, 4);
		graph1.addEdge(m23, m231, 4);
		graph1.addEdge(m23, m232, 4);
		graph1.addEdge(m23, m233, 4);
		graph1.addEdge(g11, g111, 4);
		graph1.addEdge(g11, g112, 4);
		graph1.addEdge(g11, g113, 4);
		graph1.addEdge(g12, g121, 4);
		graph1.addEdge(g12, g122, 4);
		graph1.addEdge(g12, g123, 4);
		graph1.addEdge(g13, g131, 4);
		graph1.addEdge(g13, g132, 4);
		graph1.addEdge(g13, g133, 4);
		graph1.addEdge(g21, g211, 4);
		graph1.addEdge(g21, g212, 4);
		graph1.addEdge(g21, g213, 4);
		graph1.addEdge(g22, g221, 4);
		graph1.addEdge(g22, g222, 4);
		graph1.addEdge(g22, g223, 4);
		graph1.addEdge(g23, g231, 4);
		graph1.addEdge(g23, g232, 4);
		graph1.addEdge(g23, g233, 4);
		graph1.addEdge(p11, p111, 4);
		graph1.addEdge(p11, p112, 4);
		graph1.addEdge(p11, p113, 4);
		graph1.addEdge(p12, p121, 4);
		graph1.addEdge(p12, p122, 4);
		graph1.addEdge(p12, p123, 4);
		graph1.addEdge(p13, p131, 4);
		graph1.addEdge(p13, p132, 4);
		graph1.addEdge(p13, p133, 4);
		graph1.addEdge(p21, p211, 4);
		graph1.addEdge(p21, p212, 4);
		graph1.addEdge(p21, p213, 4);
		graph1.addEdge(p22, p221, 4);
		graph1.addEdge(p22, p222, 4);
		graph1.addEdge(p22, p223, 4);
		graph1.addEdge(p23, p231, 4);
		graph1.addEdge(p23, p232, 4);
		graph1.addEdge(p23, p233, 4);
		graph1.addEdge(q11, q111, 4);
		graph1.addEdge(q11, q112, 4);
		graph1.addEdge(q11, q113, 4);
		graph1.addEdge(q12, q121, 4);
		graph1.addEdge(q12, q122, 4);
		graph1.addEdge(q12, q123, 4);
		graph1.addEdge(q13, q131, 4);
		graph1.addEdge(q13, q132, 4);
		graph1.addEdge(q13, q133, 4);
		graph1.addEdge(q21, q211, 4);
		graph1.addEdge(q21, q212, 4);
		graph1.addEdge(q21, q213, 4);
		graph1.addEdge(q22, q221, 4);
		graph1.addEdge(q22, q222, 4);
		graph1.addEdge(q22, q223, 4);
		graph1.addEdge(q23, q231, 4);
		graph1.addEdge(q23, q232, 4);
		graph1.addEdge(q23, q233, 4);
		
		graph1.addEdge(m111, z1, 5);
		graph1.addEdge(m112, z2, 5);
		graph1.addEdge(m113, z3, 5);
		graph1.addEdge(m121, z4, 5);
		graph1.addEdge(m122, z5, 5);
		graph1.addEdge(m123, z6, 5);
		graph1.addEdge(m131, z7, 5);
		graph1.addEdge(m131, z8, 5);
		graph1.addEdge(m133, z9, 5);
		graph1.addEdge(m211, z10, 5);
		graph1.addEdge(m212, z11, 5);
		graph1.addEdge(m213, z12, 5);
		graph1.addEdge(m221, z13, 5);
		graph1.addEdge(m222, z14, 5);
		graph1.addEdge(m223, z15, 5);
		graph1.addEdge(m231, z16, 5);
		graph1.addEdge(m232, z17, 5);
		graph1.addEdge(m233, z18, 5);
		graph1.addEdge(g111, z19, 5);
		graph1.addEdge(g112, z20, 5);
		graph1.addEdge(g113, z21, 5);
		graph1.addEdge(g121, z22, 5);
		graph1.addEdge(g122, z23, 5);
		graph1.addEdge(g123, z24, 5);
		graph1.addEdge(g131, z25, 5);
		graph1.addEdge(g132, z26, 5);
		graph1.addEdge(g113, z27, 5);
		graph1.addEdge(g211, z28, 5);
		graph1.addEdge(g212, z29, 5);
		graph1.addEdge(g213, z30, 5);
		graph1.addEdge(g221, z31, 5);
		graph1.addEdge(g222, z32, 5);
		graph1.addEdge(g223, z33, 5);
		graph1.addEdge(g231, z34, 5);
		graph1.addEdge(g232, z35, 5);
		graph1.addEdge(g233, z36, 5);
		graph1.addEdge(p111, z37, 5);
		graph1.addEdge(p112, z38, 5);
		graph1.addEdge(p113, z39, 5);
		graph1.addEdge(p121, z40, 5);
		graph1.addEdge(p122, z41, 5);
		graph1.addEdge(p123, z42, 5);
		graph1.addEdge(p131, z43, 5);
		graph1.addEdge(p132, z44, 5);
		graph1.addEdge(p133, z45, 5);
		graph1.addEdge(p211, z46, 5);
		graph1.addEdge(p212, z47, 5);
		graph1.addEdge(p213, z48, 5);
		graph1.addEdge(p221, z49, 5);
		graph1.addEdge(p222, z50, 5);
		graph1.addEdge(p223, z51, 5);
		graph1.addEdge(p231, z52, 5);
		graph1.addEdge(p232, z53, 5);
		graph1.addEdge(p233, z54, 5);
		graph1.addEdge(q111, z55, 5);
		graph1.addEdge(q112, z56, 5);
		graph1.addEdge(q113, z57, 5);
		graph1.addEdge(q121, z58, 5);
		graph1.addEdge(q122, z59, 5);
		graph1.addEdge(q123, z60, 5);
		graph1.addEdge(q131, z61, 5);
		graph1.addEdge(q132, z62, 5);
		graph1.addEdge(q133, z63, 5);
		graph1.addEdge(q211, z64, 5);
		graph1.addEdge(q212, z65, 5);
		graph1.addEdge(q213, z66, 5);
		graph1.addEdge(q221, z67, 5);
		graph1.addEdge(q222, z68, 5);
		graph1.addEdge(q223, z69, 5);
		graph1.addEdge(q231, z70, 5);
		graph1.addEdge(q232, z71, 5);
		graph1.addEdge(q233, z72, 5);
                
      }  
    
     
        
        
        public String ger(){
        
            if (jRadioButton1.isSelected())
             return graph1.printSucursal(m1) + graph1.printSucursal(m2);
            if (jRadioButton2.isSelected()) 
             return graph1.printSucursal(g1) + graph1.printSucursal(g2);
            if (jRadioButton3.isSelected()) 
             return graph1.printSucursal(p1) + graph1.printSucursal(p2);
            if (jRadioButton4.isSelected()) 
             return graph1.printSucursal(q1) + graph1.printSucursal(q2);
            
            else return ""; 
   
        }
        public String emp(){
            if (jRadioButton1.isSelected())
             return graph1.printSucursal(m11) + graph1.printSucursal(m12) + 
                    graph1.printSucursal(m13) + graph1.printSucursal(m21) + 
                    graph1.printSucursal(m22) + graph1.printSucursal(m23);     
            if (jRadioButton2.isSelected()) 
             return graph1.printSucursal(g11) + graph1.printSucursal(g12) + 
                    graph1.printSucursal(g13) + graph1.printSucursal(g21) + 
                    graph1.printSucursal(g22) + graph1.printSucursal(g23);
            if (jRadioButton3.isSelected()) 
             return graph1.printSucursal(p11) + graph1.printSucursal(p12) + 
                    graph1.printSucursal(p13) + graph1.printSucursal(p21) + 
                    graph1.printSucursal(p22) + graph1.printSucursal(p23);
            if (jRadioButton4.isSelected()) 
             return graph1.printSucursal(q11) + graph1.printSucursal(q12) + 
                    graph1.printSucursal(q13) + graph1.printSucursal(q21) + 
                    graph1.printSucursal(q22) + graph1.printSucursal(q23);
            
            else return ""; 
            
                 
        }
        
        public String cli(){
            if (jRadioButton1.isSelected())
             return graph1.printSucursal(m111) + graph1.printSucursal(m112) + 
                    graph1.printSucursal(m113) + graph1.printSucursal(m121) + 
                    graph1.printSucursal(m122) + graph1.printSucursal(m123) +
                    graph1.printSucursal(m131) + graph1.printSucursal(m132) + 
                    graph1.printSucursal(m133) + graph1.printSucursal(m211) + 
                    graph1.printSucursal(m212) + graph1.printSucursal(m213) +
                    graph1.printSucursal(m221) + graph1.printSucursal(m222) + 
                    graph1.printSucursal(m223) + graph1.printSucursal(m231) + 
                    graph1.printSucursal(m232) + graph1.printSucursal(m233);
            if (jRadioButton2.isSelected()) 
             return graph1.printSucursal(g111) + graph1.printSucursal(g112) + 
                    graph1.printSucursal(g113) + graph1.printSucursal(g121) + 
                    graph1.printSucursal(g122) + graph1.printSucursal(g123) +
                    graph1.printSucursal(g131) + graph1.printSucursal(g132) + 
                    graph1.printSucursal(g133) + graph1.printSucursal(g211) + 
                    graph1.printSucursal(g212) + graph1.printSucursal(g213) +
                    graph1.printSucursal(g221) + graph1.printSucursal(g222) + 
                    graph1.printSucursal(g223) + graph1.printSucursal(g231) + 
                    graph1.printSucursal(g232) + graph1.printSucursal(g233);
            if (jRadioButton3.isSelected()) 
             return graph1.printSucursal(p111) + graph1.printSucursal(p112) + 
                    graph1.printSucursal(p113) + graph1.printSucursal(p121) + 
                    graph1.printSucursal(p122) + graph1.printSucursal(p123) +
                    graph1.printSucursal(p131) + graph1.printSucursal(p132) + 
                    graph1.printSucursal(p133) + graph1.printSucursal(p211) + 
                    graph1.printSucursal(p212) + graph1.printSucursal(p213) +
                    graph1.printSucursal(p221) + graph1.printSucursal(p222) + 
                    graph1.printSucursal(p223) + graph1.printSucursal(p231) + 
                    graph1.printSucursal(p232) + graph1.printSucursal(p233);
            if (jRadioButton4.isSelected()) 
             return graph1.printSucursal(q111) + graph1.printSucursal(q112) + 
                    graph1.printSucursal(q113) + graph1.printSucursal(q121) + 
                    graph1.printSucursal(q122) + graph1.printSucursal(q123) +
                    graph1.printSucursal(q131) + graph1.printSucursal(q132) + 
                    graph1.printSucursal(q133) + graph1.printSucursal(q211) + 
                    graph1.printSucursal(q212) + graph1.printSucursal(q213) +
                    graph1.printSucursal(q221) + graph1.printSucursal(q222) + 
                    graph1.printSucursal(q223) + graph1.printSucursal(q231) + 
                    graph1.printSucursal(q232) + graph1.printSucursal(q233);
            
            else return ""; 
       
        }
        public String pre(){
            if (jRadioButton1.isSelected())
             return graph1.printSucursal(z1) + graph1.printSucursal(z2) + 
                    graph1.printSucursal(z3) + graph1.printSucursal(z4) + 
                    graph1.printSucursal(z5) + graph1.printSucursal(z6) +
                    graph1.printSucursal(z7) + graph1.printSucursal(z8) + 
                    graph1.printSucursal(z9) + graph1.printSucursal(z10) + 
                    graph1.printSucursal(z11) + graph1.printSucursal(z12) +
                    graph1.printSucursal(z13) + graph1.printSucursal(z14) + 
                    graph1.printSucursal(z15) + graph1.printSucursal(z16) + 
                    graph1.printSucursal(z17) + graph1.printSucursal(z18);
            if (jRadioButton2.isSelected()) 
             return graph1.printSucursal(z19) + graph1.printSucursal(z20) + 
                    graph1.printSucursal(z21) + graph1.printSucursal(z22) + 
                    graph1.printSucursal(z23) + graph1.printSucursal(z24) +
                    graph1.printSucursal(z25) + graph1.printSucursal(z26) + 
                    graph1.printSucursal(z27) + graph1.printSucursal(z28) + 
                    graph1.printSucursal(z29) + graph1.printSucursal(z30) +
                    graph1.printSucursal(z31) + graph1.printSucursal(z32) + 
                    graph1.printSucursal(z33) + graph1.printSucursal(z34) + 
                    graph1.printSucursal(z35) + graph1.printSucursal(z36);
            if (jRadioButton3.isSelected()) 
             return graph1.printSucursal(z37) + graph1.printSucursal(z38) + 
                    graph1.printSucursal(z39) + graph1.printSucursal(z40) + 
                    graph1.printSucursal(z41) + graph1.printSucursal(z42) +
                    graph1.printSucursal(z43) + graph1.printSucursal(z44) + 
                    graph1.printSucursal(z45) + graph1.printSucursal(z46) + 
                    graph1.printSucursal(z47) + graph1.printSucursal(z48) +
                    graph1.printSucursal(z49) + graph1.printSucursal(z50) + 
                    graph1.printSucursal(z51) + graph1.printSucursal(z52) + 
                    graph1.printSucursal(z53) + graph1.printSucursal(z54);
            if (jRadioButton4.isSelected()) 
             return graph1.printSucursal(z55) + graph1.printSucursal(z56) + 
                    graph1.printSucursal(z57) + graph1.printSucursal(z58) + 
                    graph1.printSucursal(z59) + graph1.printSucursal(z60) +
                    graph1.printSucursal(z61) + graph1.printSucursal(z62) + 
                    graph1.printSucursal(z63) + graph1.printSucursal(z64) + 
                    graph1.printSucursal(z65) + graph1.printSucursal(z66) +
                    graph1.printSucursal(z67) + graph1.printSucursal(z68) + 
                    graph1.printSucursal(z69) + graph1.printSucursal(z70) + 
                    graph1.printSucursal(z71) + graph1.printSucursal(z72);
            
            else return "";  

        }
    
    public interfaz() {
        initComponents();
        graph();
        edges();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("Prestamos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Mexico");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Guadalajara");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Puebla");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Queretaro");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Sucursales");

        jButton1.setText("Gerentes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Empleados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clientes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Graph Database");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton4)
                            .addGap(11, 11, 11))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addComponent(jButton3)
                                .addComponent(jButton1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton1)
                                .addComponent(jRadioButton3)
                                .addComponent(jRadioButton2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jRadioButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jRadioButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String r = pre();
        jTextArea3.setText(r);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String r = ger();
        jTextArea3.setText(r);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String r = emp();
        jTextArea3.setText(r);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String r = cli();
        jTextArea3.setText(r);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
