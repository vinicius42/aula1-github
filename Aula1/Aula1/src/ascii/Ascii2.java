package ascii;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ascii2 {
	public boolean gravar(InputStream in, String fileName) throws Exception{		
		boolean gravado = false;
		String destino = "D://testeAscii";
		
		try {
			BufferedInputStream bufferIn = new BufferedInputStream(in);
			
			File file = new File(destino + fileName);
			file.createNewFile();
			
			OutputStream bos = new FileOutputStream(file);
			
			int teste = 0;
			while ((teste = bufferIn.read()) != -1) {
				bos.write(teste);
				System.out.println(teste);
            }			
			
			in.close();
			bufferIn.close();
			bos.close();
			
			gravado = true;
			
		} catch (Exception e) {
			throw new Exception(getClass().getSimpleName() + " : " + e.getMessage()); 
		}	
		
		return gravado;
	}
}
