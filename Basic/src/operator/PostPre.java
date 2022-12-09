package operator;

public class PostPre {

	public static void main(String[] args) {
	int j=5;
	int z=(j--)+(j++)+(--j)+(++j);
	
//hint i=2
	/*
	int z=i++ + --i + i-- + ++i
			i++   A  =2   in=3
			--i   de: 2    As:2
			i--   As:2     de:1
			++i   inc:2     As:2
			       z=2+2+2+2=8
			       
    int z=(j--)+(j++)+(--j)+(++j);
	j--  A=5  de=4
	j++  A=4  in=5
	--j  dec=4 As=4
	++j   inc=5 as=5
	5+4+4+5
	
*/
	System.out.println(z);


	}

}
