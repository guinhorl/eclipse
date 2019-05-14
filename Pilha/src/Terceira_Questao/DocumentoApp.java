package Terceira_Questao;

public class DocumentoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tipoDoc, remetente, respon;
		int op = 0, cont_norm = 0, cont_urg = 0, cont_ass = 0;
		Documento aux;
		Documento docAssinado;		
		LinkStackDocumento pilhaDocNormal = new LinkStackDocumento(); // make stack
		LinkListDocumento filaDocUrgente = new LinkListDocumento();
		LinkListDocumento filaDocAssinados = new LinkListDocumento();

		System.out.println("=================================");
		System.out.println("              DOC APP              ");
		System.out.println("   GERENCIAMENTO DE DOCUMENTOS       ");
		System.out.println("=================================");
		System.out.println("");
		System.out.println("1 - Cadastrar Documento");
		System.out.println("2 - Assinar Documento");
		System.out.println("3 - Relatóri FINAL");
		System.out.println("4 - Sair");
		System.out.print("Digite a opção: ");
		op = Read.readInt();
		while (op != 4) {
			switch (op) {
			case 1: // Inserção DOCUMENTO
			{
				System.out.println("");
				System.out.println("INCLUSÃO");
				System.out.println(" ");
				System.out.print("Informe o Tipo do Documento - (U)-URGENTE OU (N)-NORMAL: ");
				tipoDoc = Read.readString();
				if ((tipoDoc.equals("U")) || (tipoDoc.equals("N"))) {

					switch (tipoDoc) { // validando o tipo do documento
					case "U": // URGENTE OU NORMAL
					{
						tipoDoc = "URGENTE";
						System.out.println("URGENTE! ");
						System.out.println("Informe o nome do REMETENTE: ");
						remetente = Read.readString();
						/*
						 * System.out.println("Informe o RESPEONSÀVEL: "); respon = Read.readString();
						 */
						aux = new Documento(tipoDoc, remetente, null);
						filaDocUrgente.insertFirst(aux);
						cont_urg++;
						break;
					}
					case "N": 
					{
						tipoDoc = "NORMAL";
						System.out.println("NORMAL! ");
						System.out.println("Informe o nome do REMETENTE: ");
						remetente = Read.readString();
						/*
						 * System.out.println("Informe o RESPEONSÀVEL: "); respon = Read.readString();
						 */
						aux = new Documento(tipoDoc, remetente, null);
						pilhaDocNormal.push(aux);
						cont_norm++;
						break;
					}
					default: {						
					}
					}}else {
						System.out.println("!!ATENÇÃO VALOR INFORMADO NÃO CONFERE COM A OPÇÃO!!");
						System.out.println("");
						System.out.println("");
					}
				

				break;
			}
			case 2:// ASSINAR DOCUMENTO
			{
				if (!filaDocUrgente.isEmpty()) {
					docAssinado = filaDocUrgente.deleteFirst();
					System.out.println("Informe a ASSINATURA DO RESPEONSÀVEL: ");
					respon = Read.readString(); // assinatura vem aqui
					docAssinado.setResponsavel(respon); // entra aqui
					filaDocAssinados.insertFirst(docAssinado);
					cont_ass++;
					cont_urg--;
				} else if (!pilhaDocNormal.isEmpty()) {
					docAssinado = pilhaDocNormal.pop();
					System.out.println("Informe a ASSINATURA DO RESPEONSÀVEL: ");
					respon = Read.readString(); // assinatura vem aqui
					docAssinado.setResponsavel(respon); // entra aqui
					filaDocAssinados.insertFirst(docAssinado);
					cont_ass++;
					cont_norm--;
				} else
					System.out.println("NÃO CONTEM DOCUMENTO CADASTRADO!!");
				break;
			}

			case 3: // Informa relatório FINAL
			{

				System.out.println("=====================================");
				System.out.println("           << RELATÓRIO >>           ");
				System.out.println("=====================================");
				System.out.println("");
				System.out.println("Quantidade a serem assinados: " + (cont_norm + cont_urg));
				System.out.println("");
				System.out.println("Quantidade de documentos TIPO NORMAL: " + cont_norm);
				System.out.println("");
				System.out.println("Quantidade de documentos TIPO URGENTE: " + cont_urg);
				System.out.println("");
				System.out.println("Quantidade de documentos ASSINADOS: " + cont_ass);
				System.out.println("");
				System.out.println("====================================");
				break;
			}
			default: {
				System.out.println("Opção Inválida!");
			}
			}
			System.out.println("=================================");
			System.out.println("              DOC APP              ");
			System.out.println("   GERENCIAMENTO DE DOCUMENTOS       ");
			System.out.println("=================================");
			System.out.println("");
			System.out.println("1 - Cadastrar Documento");
			System.out.println("2 - Assinar Documento");
			System.out.println("3 - Relatóri FINAL");
			System.out.println("4 - Sair");
			System.out.print("Digite a opção: ");
			op = Read.readInt();
		}
		System.out.print("*** FIM ***");

	}

}
