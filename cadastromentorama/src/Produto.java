import Models.Produtto;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Produto {
    public static void main(String[]args)throws Exception{
            System.out.println("--- PEDIDO DE VENDAS ---");

          int option;

          do{
            System.out.println("1 - CADASTRAR PRODUTO");
            System.out.println("0 - SAIR ");
                              Scanner scanner = new Scanner(System.in);
            System.out.print("Qual opcao deseja realizar: ");
                              option = scanner.nextInt();
                              process(option);
        } while(option !=0);
        }
    public static void process(int option) throws Exception {

            switch (option){
            case 1:{

                Scanner scanner = new Scanner(System.in);
                System.out.println("Qual descricao você deseja dar ao novo produto: ");
                                  String descricao = scanner.nextLine();
                System.out.println("Qual Id voce deseja dar ao ovo produto: ");
                                  int Id = scanner.nextInt();
                System.out.println("Qual o preco: ");
                                  double preco = scanner.nextDouble();
                System.out.println("Qual a validade: ");
                                  String dataString = scanner.next();
                                  Date dataValidade = new SimpleDateFormat("dd/mm/yyyy").parse(dataString);
                                  Produtto novoProdutto = new Produtto(Id,descricao,preco,dataValidade);
                System.out.println("Novo produto criado com sucesso");
                System.out.println("--- ID " + novoProdutto.getId());
                System.out.println("--- Descricao " + novoProdutto.getDescricao());
                System.out.println("---PRECO: " + novoProdutto.getPreco());
                System.out.println("DATA DE VALIDADE: " + novoProdutto.getDataValidade());
                System.out.println("------ CADASTRADO COM SUCESSO ------");
            }
            }
            }
            }
