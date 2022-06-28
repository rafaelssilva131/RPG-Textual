

import java.util.Random;
import java.util.Scanner;

public class rpgpi {

    public static void main(String[] args) {

        System.out.println("\n--------------------------------------------------");
        imprimir("\n=-=-=-=-=-=-=-=-=-=- KALAHARY =-=-=-=-=-=-=-=-=-=-\n");
        menuInicial();

    }

    static void menuInicial() {

        String apelido = "";
        System.out.println();
        boolean loopMenu = true;

        while (loopMenu == true) {

            System.out.println("--------------------------------------------------");
            imprimir("**** MENU PRINCIPAL ****");
            System.out.println("--------------------------------------------------");
            imprimir("(1) - Iniciar");
            imprimir("(2) - Instru��es");
            imprimir("(3) - Sair");
            imprimir(" ");
            int op��oMenu = numero();

            switch (op��oMenu) {

                case 1 -> {

                    apelido = player();
                    introdu��o();
                    int classe = escolhaClasse();

                    if (classe == 1) {
                        loopMenu = batalha1(apelido);
                    }

                    if (classe == 2) {
                        loopMenu = batalha2(apelido);
                    }

                    if (classe == 3) {
                        loopMenu = batalha3(apelido);
                    }
                }

                case 2 ->
                    loopMenu = instru��es();

                case 3 ->
                    loopMenu = false;

                default -> {

                    System.out.println("Op��o inv�lida, tente novamente!");
                    loopMenu = true;
                }

            }
        }
    }

    static int numero() {
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        return user;
    }

    static String texto() {
        Scanner input = new Scanner(System.in);
        String user = input.next();
        return user;
    }

    static String player() {
        System.out.println("\n--------------------------------------------------");
        imprimir("Qual o seu nome aventureiro? ");
        System.out.println("--------------------------------------------------\n");
        String user = texto();
        return user;
    }

    static void imprimir(String imprimir) {

        int cont = imprimir.length();

        for (int i = 0; i < cont; i++) {
            char result = imprimir.charAt(i);

            try {
                Thread.sleep(80);
                System.out.print(result);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    static void introdu��o() {

        System.out.println();
        System.out.println("Digite N para a Introdu��o do jogo");
        System.out.println("Ou digite J para come�ar o jogo");
        String n = texto();
        n = n.toUpperCase();
        if (n.equals("N")) {
            //Aqui � a introdu��o que pode ser pulada 
            System.out.println();
            imprimir(" Di�rio: 10-09-21. O que parece apenas um jogo para outras pessoas, � uma tradi��o para a fam�lia Freitas. N�s ca�amos tesouros antigos de povos esquecidos pela humanidade como os Astecas e Incas.\n");
            imprimir("Mas, desta vez, as coisas deram errado. Nossas pesquisas revelaram uma ilha no Oceano Pac�fico crentes de que, l�, encontrar�amos um grande tesouro Maori. \n");
            imprimir("Primo Alexandre, destemido como era, n�o perdeu tempo, e partiu do Porto de Santos rumo a ilha chamada pelos cadernos de pesquisa como: 'Kalahari'. \n ");
            imprimir("Mas, com tr�s meses sem not�cias de Primo Alexandre, nossa fam�lia come�ou a se preocupar com seu desaparecimento. \n");
            imprimir("E, com isto, eu, Marina Freitas, bi�loga pela Universidade de Campinas. Pedro Freitas, atirador profissional em ol�mpiadas e Jos�, explorador de povos antigos, decidimos resgatar Primo Alexandre.  \n");

        }
        System.out.println();
        imprimir("Ap�s viajar a Nova Zel�ndia, Marina, Pedro e Jos� Freitas, alugam um avi�o bimotor e viajam rumo a ilha de Kalahari ansiosos por revelarem a situa��o de Primo Alexandre e o tesouro Maori.\n");
        imprimir("No entanto, mal perceberam que, para chegar na ilha, teriam que atravessar uma tempestade com chuva, raios e ventania e torcer para o avi�o aguentar. \n");
        imprimir("Mas, um raio acerta o avi�o e destr�i umas das asas do bimotor e eles caem na mata densa da floresta da ilha e em locais diferentes. \n");
    }

    static int escolhaClasse() {

        int classe = 0;

        System.out.println("\n--------------------------------------------------");
        imprimir("Antes de come�ar, selecione uma das classes abaixo:");
        System.out.println("--------------------------------------------------\n");
        imprimir("(1) - Ca�ador");
        imprimir("(2) - Explorador");
        imprimir("(3) - Bi�loga");
        System.out.println();
        int escolha = numero();

        switch (escolha) {

            case 1:

                System.out.println("\n--------------------------------------------------");
                imprimir("        Voc� escolheu o ca�ador, vamos l�!");
                System.out.println("--------------------------------------------------\n");
                classe = 1;
                break;

            case 2:

                System.out.println("\n--------------------------------------------------");
                imprimir("      Voc� escolheu o explorador, vamos l�!");
                System.out.println("--------------------------------------------------\n");
                classe = 2;
                break;

            case 3:

                System.out.println("\n--------------------------------------------------");
                imprimir("        Voc� escolheu a bi�loga , vamos l� !");
                System.out.println("--------------------------------------------------\n");
                classe = 3;
                break;

        }
        return classe;
    }

    static int ataquePc() {

        Random input = new Random();
        return input.nextInt(3) + 1;
    }

    static void imprimeHp(int hpUsuario, int hpPc, int especial) {

        System.out.println("\n--------------------------------------------------");
        System.out.println("* HP USER: " + hpUsuario + "* HP PC: " + hpPc + "* ESPECIAL: " + especial + "/1");
        System.out.println("\n--------------------------------------------------");
    }

    static boolean instru��es() {

        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("Instruções: olá, jogador(a). Neste jogo de RPG em formato textual, você irá explorar uma aventura de uma famalia de aventureiros em busca de um parente e tesouro perdido. \n");
        System.out.println("Nome e Classe: como primeiro passo, antes de jogar, é necessário que voc� selecione o nome como deseja ser chamado e a classe do personagem.\n");
        System.out.println("Classes: neste jogo, temos tr�s classes - (1) Caçador; (2)  Explorador; e (3) Bi�loga. Cada classe tem um conjunto de ataques e um especial único. \n ");
        System.out.println("Caminhos: cada personagem e classe, neste jogo, ter� um caminho exclusivo com inimigos e combates pr�prios para enfrentar ao longo da sua jornada. \n");
        System.out.println("Evolução: a cada desafio e inimigo superado, a habilidade �nica ser� aprimorada para uma vers�o melhor e mais forte para encarar os proximos embates. \n ");
        System.out.println("Desafio Final: por fim, para concluir a narrativa, voc� ser� confrontado com um inimigo final a ser derrotado e conhecer o final da história. \n ");

        System.out.println("(1) - Menu");
        System.out.println("(2) - Sair");
        System.out.println("");

        int escolha = input.nextInt();

        boolean loop = true;

        switch (escolha) {

            case 1:

                loop = true;
                break;

            case 2:

                loop = false;
                break;

            default:

                System.out.println("Op��o inv�lida, tente novamente!");
                break;

        }
        return loop;
    }

    static boolean batalha1(String nome) {

        Scanner input = new Scanner(System.in);

        // FASE 1 //
        System.out.println("");
        System.out.println("--------------------------------------------------");
        imprimir("Com dor nas costas e na cabe�a, Pedro reconhece que a ideia de saltar do avi�o antes da queda e usar dos galhos das �rvores como amortecedores n�o foi uma m� ideia. \n");
        imprimir("O que ele n�o esperava era de que os galhos n�o fossem t�o resistentes quanto gostaria e acabasse por bater cabe�a, peito e costas em v�rios galhos antes de cair no ch�o. \n");
        imprimir("Contudo, agradece por estar com sua faca e poder, ent�o, se virar na floresta para sair da ilha e reencontrar o Primo Alexandre. \n");
        imprimir("No entanto, Pedro v� que n�o est� sozinho, pois piratas Somalis festejam na praia entorno da fogueira. E decide por ir atr�s de um pirata isolado para tomar sua pistola. \n");
        imprimir("Mas, sem querer, Pedro pisa e quebra um galho pr�ximo do pirata, que o percebe e saca sua faca para mat�-lo.\n ");
        System.out.println("--------------------------------------------------");
        imprimir("Seja bem vindo " + nome);

        // 1� BATALHA //
        int hpUsuario = 100, hpPc = 100, especial = 1;
        boolean loopMenu = true;

        while (hpUsuario > 0) {

            while (hpUsuario > 0 && hpPc > 0) {

                imprimeHp(hpUsuario, hpPc, especial);

                int escolha = ataquepersonagem1(1, 0);

                switch (escolha) {

                    case 1 -> {
                        System.out.println("");
                        System.out.println("Voc� deu um soco no queixo do pirata !");
                        hpPc -= 5;
                    }

                    case 2 -> {
                        System.out.println("");
                        System.out.println("Voc� deu um chute na barriga do pirata !");
                        hpPc -= 10;
                    }

                    case 3 -> {

                        if (especial > 0) {

                            System.out.println("");
                            imprimir("Voc� cortou o pirata com a sua faca !");
                            hpPc -= 30;
                            especial--;
                        } else {

                            System.out.println("Voce n�o tem mais especial");
                        }

                    }

                    default ->
                        System.out.println("Op��o inv�lida!");

                }

                if (hpPc > 0) {

                    escolha = ataquePc();

                    switch (escolha) {

                        case 1:

                            System.out.println("");
                            System.out.println(" O pirata deu um soco no seu nariz!");
                            System.out.println("");
                            hpUsuario -= 5;
                            break;

                        case 2:

                            System.out.println("");
                            System.out.println(" O pirata bateu em voc� com um porrete!");
                            System.out.println("");
                            hpUsuario -= 7;
                            break;

                        case 3:

                            System.out.println("");
                            imprimir(" O pirata atirou em voc� com uma pistola !");
                            System.out.println("");
                            hpUsuario -= 13;
                            break;

                    }

                } else {

                    imprimir(" O pirata caiu atordoado no ch�o! Voc� pegou sua pistola e se escondeu na mata. \n");
                    System.out.println("");

                    // FASE 2 //
                    imprimir("Armado com uma faca e uma pistola e certo de que os outros piratas n�o escutaram a briga, Pedro respira aliviado. \n");
                    imprimir("Mas, perdido e confuso para onde ir, Pedro observa o ambiente da ilha para decidir aonde ir. \n");
                    imprimir("E v�, ent�o, um antigo farol abandonado na costa da ilha e decide ir at� l� para ter uma vis�o ampla da ilha. \n");
                    imprimir("No entanto, percebe que, em seu encal�o, vem um grupo de piratas enquanto atiram em sua dire��o e corre para o farol a fim de se proteger. \n");
                    imprimir(" E, enquanto avan�a rumo ao farol abandonado, Pedro segue atirando de volta para atrasar a persegui��o dos piratas. \n");

                    // 2� BATALHA //
                    hpUsuario = 120;
                    hpPc = 150;
                    especial = 1;

                    while (hpUsuario > 0) {

                        while (hpUsuario > 0 && hpPc > 0) {

                            imprimeHp(hpUsuario, hpPc, especial);

                            escolha = ataquepersonagem1(2, 1);

                            switch (escolha) {

                                case 1 -> {
                                    System.out.println("");
                                    System.out.println("Voc� atirou uma pedra na dire��o dos piratas!");
                                    hpPc -= 15;
                                }

                                case 2 -> {
                                    System.out.println("");
                                    System.out.println("Voc� deu um tiro de pistola na dire��o dos piratas!");
                                    hpPc -= 20;
                                }

                                case 3 -> {

                                    if (especial > 0) {

                                        System.out.println("");
                                        imprimir("Voc� deu v�rios tiros em sequ�ncia nos piratas !");
                                        hpPc -= 50;
                                        especial--;
                                    } else {

                                        System.out.println("Voce n�o tem mais especial");
                                    }
                                }

                                default ->
                                    System.out.println("Op��o inv�lida!");

                            }

                            if (hpPc > 0) {

                                escolha = ataquePc();

                                switch (escolha) {

                                    case 1 -> {
                                        System.out.println("");
                                        System.out.println(" Os piratas atiram flechas em voc� !");
                                        System.out.println("");
                                        hpUsuario -= 7;
                                    }

                                    case 2 -> {
                                        System.out.println("");
                                        System.out.println(" Os piratas d�o tiros de rasp�o em voc� !");
                                        System.out.println("");
                                        hpUsuario -= 10;
                                    }

                                    case 3 -> {
                                        System.out.println("");
                                        imprimir("Os piratas atiram com precis�o em voc� !");
                                        System.out.println("");
                                        hpUsuario -= 16;
                                    }

                                }
                            } else {

                                imprimir("Pedro, ent�o, conseque chegar ao farol e corre pelas escadarias para o �ltimo andar para se entrincheirar enquanto os piratas o perseguem. \n");
                                imprimir("E, durante a montagem da sua barreira com os velhos m�veis para dificultar a entrada dos piratas, Pedro descobre um velho rifle no arm�rio de equipamentos. \n");
                                imprimir("Mas, com os  piratas derrubando sua barricada de prote��o, Pedro decide rapidamente revidar e descarregar seu rifle nos piratas. \n");
                                System.out.println("");
                                // FASE 3 //
                                imprimir(" Agora, Pedro sabe consigo mesmo, � uma quest�o de vida ou morte e o sucesso de resgatar Alexandre depende de sua habilidade com armas.\n");
                                // 3� FASE //
                                hpUsuario = 130;
                                hpPc = 180;
                                especial = 1;

                                while (hpUsuario > 0) {

                                    while (hpUsuario > 0 && hpPc > 0) {

                                        imprimeHp(hpUsuario, hpPc, especial);

                                        escolha = ataquepersonagem1(3, 2);

                                        switch (escolha) {
                                            case 1 -> {
                                                System.out.println("");
                                                System.out.println("Voc� empurrou um pirata por escada abaixo!");
                                                hpPc -= 25;
                                            }

                                            case 2 -> {
                                                System.out.println("");
                                                System.out.println("Voc� bateu com um peda�o de madeira no pirata!");
                                                hpPc -= 35;
                                            }

                                            case 3 -> {

                                                if (especial > 0) {
                                                    imprimir("Voc� atirou com seu rifle!");
                                                    hpPc -= 90;
                                                    especial--;
                                                } else {
                                                    System.out.println("Voc� n�o tem mais for�a para usar o especial!");
                                                }
                                            }

                                            default -> {
                                                System.out.println("Op��o inv�lida. Voc� errou o ataque!!");
                                            }

                                        }
                                        if (hpPc > 0) {

                                            escolha = ataquePc();

                                            switch (escolha) {
                                                case 1 -> {
                                                    System.out.println(" Pirata bate em voc� com um taco de beisebol !");
                                                    hpUsuario -= 15;
                                                }

                                                case 2 -> {

                                                    System.out.println(" Pirata lan�a uma faca em voc� !");
                                                    hpUsuario -= 20;
                                                }

                                                case 3 -> {

                                                    imprimir(" Pirata atira com pistola contra voc� !");
                                                    hpUsuario -= 25;
                                                }

                                            }

                                        } else {
                                            System.out.println("--------------------------------------------------");
                                            imprimir(" Esgotado, Pedro percebe que, no final, conseguiu derrubar v�rios piratas e afastar o restante com estes fugindo em busca de refor�os. \n");
                                            imprimir("Mas, sem demora, Pedro v� ao longe uma pista de pouso e uma torre de comando de tr�fego a�reo.E, sem pensar muito, decide ir l� em busca de ajuda. \n");
                                            imprimir("No meio do caminho para o aeroporto, Pedro descobre uma carca�a de um avi�o da 2� Guerra Mundial, e, em sua cabine, uma antiga metralhadora ainda funcional. \n");
                                            imprimir("E, seguindo para o aeroporto, Pedro identifica um gorila perseguindo um sujeito enquanto este se refugia na torre de comando. \n ");
                                            imprimir("E percebe, ent�o, � o Primo Alexandre e decide ir em seu socorro e lidar com o gorila... \n ");
                                            System.out.println("--------------------------------------------------\n");

                                            int personagem = 0;
                                            desafioFinal(4, personagem);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return menuDerrota();
    }

    static boolean batalha2(String nome) {

        // FASE 1 //
        System.out.println("\n--------------------------------------------------");
        imprimir("Bem Vindo ao Jogo " + nome);
        imprimir("No momento em que Jos� saltou do avi�o antes da queda, a �nica coisa em que pensou foi em pular com os olhos fechados e torcer para cair em seguran�a. \n");
        imprimir("Com sorte, n�o se espatifou no ch�o, mas rolou diretamente por uma pequena gruta, o que, pelo menos, aliviou a for�a da queda. \n");
        imprimir("Assustado com a escurid�o da caverna, Jos�  acende um f�sforo, pega um peda�o de madeira do ch�o e rasga a manga da jaqueta para acender uma tocha. \n");
        imprimir("Contudo, o que n�o percebe � que, com  a luz da tocha acesa, um grupo de morcegos pendurados no teto se amendrontam  e um grande morcego o ataca. \n");
        System.out.println("--------------------------------------------------\n");

        // 1� BATALHA //
        int hpUsuario = 100, hpPc = 100, especial = 1;
        boolean loopMenu = true;

        while (hpUsuario > 0) {

            while (hpUsuario > 0 && hpPc > 0) {

                imprimeHp(hpUsuario, hpPc, especial);

                int escolha = ataquepersonagem2(1, 0);

                switch (escolha) {

                    case 1 -> {
                        System.out.println("\n  Voc� deu um tapa no morcego !");
                        hpPc -= 10;
                        break;
                    }
                    case 2 -> {
                        System.out.println("\n  Voc� bateu com a tocha acesa no morcego !");
                        hpPc -= 15;
                        break;
                    }
                    case 3 -> {

                        if (especial > 0) {
                            System.out.println("");
                            imprimir("Voc� esfaqueou o morcego com o fac�o !");
                            hpPc -= 30;
                            especial--;
                        } else {
                            System.out.println("Voce n�o tem mais especial");
                        }
                        break;
                    }
                    default -> {
                        System.out.println("Op��o inv�lida, voc� perdeu sua vez!");
                    }
                }

                if (hpPc > 0) {

                    escolha = ataquePc();

                    switch (escolha) {
                        case 1 -> {
                            System.out.println("\n O morcego mordeu o seu nariz !\n -05 hp");
                            hpUsuario -= 5;
                            break;
                        }
                        case 2 -> {
                            System.out.println("\n O morcego cortou o seu rosto com as garras !\n -10 hp");
                            hpUsuario -= 10;
                            break;
                        }
                        case 3 -> {
                            imprimir("\n  O morcego mordeu o seu pesco�o !\n -15 hp");
                            hpUsuario -= 15;
                            break;
                        }
                    }
                } else {
                    System.out.println("--------------------------------------------------");
                    imprimir(" O morcego fugiu! Mas, sem perder tempo, Jos� procura e encontra uma fissura na parede da caverna e escapa por l�. \n");
                    System.out.println("--------------------------------------------------\n");

                    // FASE 2 //
                    imprimir(" Mas, saindo da brecha, Jos� deslumbra um lago interno da caverna iluminado pela luz do sol entrando por um  buraco no teto da caverna com uma cachoeira \n.");
                    imprimir(" E se maravilha com a caverna marcada por escadas e est�tuas de deuses antigos escavados em rocha. Por�m, cansado e com sede, decide beber a �gua do lago. \n");
                    imprimir(" Enquanto descia as escadas, Jos� aproveita e toma para si uma lan�a de ouro posta em uma est�tua por precau��o. \n");
                    imprimir(" Precau��o correta, porque, durante o aliviar da sede no lago, uma lacraia desce pela parede atr�s dele e, de prontid�o, Jos� saca a lan�a. \n ");

                    hpUsuario = 120;
                    hpPc = 150;
                    especial = 1;

                    while (hpUsuario > 0) {

                        while (hpUsuario > 0 && hpPc > 0) {

                            imprimeHp(hpUsuario, hpPc, especial);

                            escolha = ataquepersonagem2(2, 1);

                            switch (escolha) {

                                case 1 -> {
                                    System.out.println("\n Voc� deu um pontap� na lacraia !");
                                    hpPc -= 15;
                                    break;
                                }
                                case 2 -> {
                                    System.out.println("\n  Voc� bateu com sua tocha na lacraia!");
                                    hpPc -= 25;
                                    break;
                                }
                                case 3 -> {
                                    if (especial > 0) {

                                        System.out.println("");
                                        imprimir("Voc� perfurou a lacraia com a lan�a !");
                                        hpPc -= 70;
                                        especial--;
                                    } else {

                                        System.out.println("Voce n�o tem mais especial");
                                    }
                                    break;
                                }
                                default -> {
                                    System.out.println("Op��o inv�lida, voc� perdeu sua vez!");
                                }
                            }

                            if (hpPc > 0) {

                                escolha = ataquePc();

                                switch (escolha) {

                                    case 1 -> {
                                        System.out.println("\n Lacraia pula em voc� e te derruba \n -10 hp");
                                        hpUsuario -= 10;
                                        break;
                                    }
                                    case 2 -> {
                                        System.out.println("\n Lacraia se enrola em voc� e espreme seus ossos !\n -15 hp");
                                        System.out.println("");
                                        hpUsuario -= 14;
                                        break;
                                    }
                                    case 3 -> {
                                        imprimir("\n Lacraia te morde com suas mand�bulas !\n -20 hp");
                                        hpUsuario -= 18;
                                        break;
                                    }
                                }
                            } else {

                                System.out.println("--------------------------------------------------");
                                imprimir(" Depois de uma luta intensa e dif�cil, Jos� consegue matar a lacraia. \n");
                                imprimir(" E, ao se virar para sentar e descansar, Jos�  v�  uma multid�o de an�es, um povo do mundo subterr�neo. \n");
                                imprimir(" Ent�o, um an�o mais forte e, aparentemente, ser o l�der, toma a frente e se direciona a Jos� e a entrega um arco e flecha como presente. \n");
                                imprimir(" E se porta em rever�ncia e em agradecimento pela execu��o da lacraia. Em resposta, Jos� repete a postura e se prepara para seguir em frente. \n");
                                System.out.println("--------------------------------------------------\n");

                                // FASE 3 //
                                imprimir(" Armado com uma faca, lan�a e arco e flecha, Jos� observa com aten��o a regi�o do lago para achar uma sa�da. \n");
                                imprimir(" E percebe que, em uma ponta do lago, escoa um pequeno riacho para fora da caverna. E decide segu�-lo. \n");
                                imprimir(" E, ao seguir pelo riacho, Jos� encontra uma sa�da desaguando no oceano em uma pequena praia frente a sa�da da caverna. \n");
                                imprimir(" Mas, ao sair da caverna, se depara com um acampamento de piratas Somalis e, sorrateiramente, decide elimin�-los seu arco e flecha. \n ");
                                imprimir(" Contudo, ao acertar um pirata, este grita de dor e um pirata localiza Jos� e o ataca. \n ");

                                hpUsuario = 130;
                                hpPc = 180;
                                especial = 1;

                                while (hpUsuario > 0) {

                                    while (hpUsuario > 0 && hpPc > 0) {

                                        imprimeHp(hpUsuario, hpPc, especial);

                                        escolha = ataquepersonagem2(3, 2);

                                        switch (escolha) {

                                            case 1 -> {
                                                System.out.println("\n Voc� deu uma facada no pirata !");
                                                hpPc -= 25;
                                                break;
                                            }
                                            case 2 -> {
                                                System.out.println("\n Voc� perfurou o pirata com a lan�a !");
                                                hpPc -= 35;
                                                break;
                                            }
                                            case 3 -> {
                                                if (especial > 0) {

                                                    System.out.println("");
                                                    imprimir("Voc� flechou o pirata ! ");
                                                    hpPc -= 90;
                                                    especial--;
                                                } else {

                                                    System.out.println(" Voc� n�o tem mais especial");
                                                }
                                                break;
                                            }
                                            default -> {
                                                System.out.println(" Op��o inv�lida, voc� perdeu a vez!");
                                            }
                                        }

                                        if (hpPc > 0) {

                                            escolha = ataquePc();

                                            switch (escolha) {

                                                case 1 -> {
                                                    System.out.println("\n O pirata arremessa a faca em voc� ! \n -15 hp");
                                                    hpUsuario -= 15;
                                                    break;
                                                }
                                                case 2 -> {
                                                    System.out.println("\n O pirata te acerta com um porrete !\n -20 hp");
                                                    System.out.println("");
                                                    hpUsuario -= 20;
                                                    break;
                                                }
                                                case 3 -> {
                                                    imprimir("\n O pirata atira com um rev�lver em voc� !\n -25 hp");
                                                    hpUsuario -= 25;
                                                    break;
                                                }
                                            }
                                        } else {
                                            System.out.println("--------------------------------------------------");
                                            imprimir(" Com o �ltimo pirata morto, Jos� pega um rifle do ba� de armas para se defender melhor. \n");
                                            imprimir(" Mas, desorientado quanto a onde ir e retomar a busca por Primo Alexandre, Jos� avalia o terreno ao redor. \n ");
                                            imprimir(" Com isso, v� a foz de um rio, e conclui que o rio nasce em um ponto mais alto e com melhor vista da regi�o para localiza��o.\n");
                                            imprimir(" E, seguindo rio acima, Jos� encontra um posto de abastecimento de �gua de um aeroporto e vai a este em busca de informa��es.\n");
                                            imprimir(" Mas, ao chegar l�, v� Primo Alexandre fugindo para um galp�o com um gorila o perseguindo.E decide encarar o gorila e resgatar seu primo.\n");

                                            System.out.println("--------------------------------------------------\n");

                                            int personagem = 1;
                                            desafioFinal(4, personagem);
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return menuDerrota();
    }

    static boolean batalha3(String nome) {

        // FASE 1 //
        System.out.println("\n--------------------------------------------------");
        imprimir(" Bem Vindo ao Jogo! " + nome);
        imprimir(" Atordoada pela queda do avi�o, Marina recupera a consci�ncia e se pergunta como sobreviveu, onde est�o seus irm�os Pedro e Jos� e se est�o bem. \n");
        imprimir(" Mas, vendo-se sozinha em meio a mata fechada da ilha de Kalahari, Marina lembra de que, t�o importante quanto a sobreviv�ncia e sair da ilha, � encontrar Primo Alexandre. \n");
        imprimir(" E, apesar de perdida, v� o pico de um monte no horizonte e decide seguir para l� para se localizar melhor e ir investigando onde est� seu parente. \n");
        imprimir(" Mas, n�o ela esperava que, nem os machucados da queda se curariam, ela encontraria um Drag�o-de-Komodo rastejando rapidamente na sua dire��o com sangue nos olhos. \n");

        // 1� BATALHA //
        int hpUsuario = 100, hpPc = 100, especial = 1;
        boolean loopMenu = true;

        while (hpUsuario > 0) {

            while (hpUsuario > 0 && hpPc > 0) {

                imprimeHp(hpUsuario, hpPc, especial);

                int escolha = ataquepersonagem3(1, 0);

                switch (escolha) {

                    case 1 -> {
                        System.out.println("\n  Voc� bateu com a sua mochila nele!");
                        hpPc -= 10;
                        break;
                    }
                    case 2 -> {
                        System.out.println("\n  Voc� deu uma bica nele!");
                        hpPc -= 15;
                        break;
                    }
                    case 3 -> {
                        imprimir("\n  Voc� comeu uma pa�oca!");
                        hpUsuario += 25;
                        especial--;
                        break;
                    }
                    default -> {
                        System.out.println("Op��o inv�lida!");
                    }
                }

                if (hpPc > 0) {

                    escolha = ataquePc();

                    switch (escolha) {

                        case 1 -> {
                            System.out.println("\n Drag�o-de-Komodo mordeu a sua canela! \n Voc� perdeu 5 de vida");
                            hpUsuario -= 5;
                            break;
                        }
                        case 2 -> {
                            System.out.println("\n Drag�o-de-Komodo bateu com a cauda na sua cara !\n Voc� perdeu 10 de vida");
                            hpUsuario -= 10;
                            break;
                        }
                        case 3 -> {
                            imprimir("\n Drag�o-de-Komodo cuspiu �cido em voc� !\n Voc� perdeu 15  de vida");
                            hpUsuario -= 15;
                            break;
                        }
                    }

                } else {

                    System.out.println("--------------------------------------------------");
                    imprimir(" Drag�o-de-Komodo foi derrotado! Fugiu e se escondeu na mata!");
                    imprimir(" � hora de seguir em frente com a busca...");
                    System.out.println("--------------------------------------------------\n");

                    // FASE 2 //
                    imprimir(" Aliviada com a fuga do Drag�o-de-Komodo, Marina decide por seguir com sua jornada rumo ao monte. \n");
                    imprimir(" Chegando ao monte, Marina observa uma aldeia de nativos da ilha e decide por ir buscar informa��es com eles e descobrir como escapar da ilha e se viram seus irm�os e primo. \n");
                    imprimir(" No entanto, ao chegar l� e tentar o primeiro contato, Marina se v� cercada por nativos hostis e com lan�as apontadas para ela. \n");
                    imprimir(" Marina decide por, ent�o, correr e se esconder em uma tenda. Mas, � encontrada por um nativo e � for�ada a lutar novamente. \n");

                    // 2� BATALHA //
                    hpUsuario = 120;
                    hpPc = 150;
                    especial = 1;

                    while (hpUsuario > 0) {

                        while (hpUsuario > 0 && hpPc > 0) {

                            imprimeHp(hpUsuario, hpPc, especial);

                            escolha = ataquepersonagem3(2, 1);

                            switch (escolha) {

                                case 1 -> {
                                    System.out.println("\n Voc� deu um soco na cara dele! ");
                                    hpPc -= 10;
                                    break;
                                }
                                case 2 -> {
                                    System.out.println("\n Voc� jogou uma pedra nele. ");
                                    hpPc -= 25;
                                    break;
                                }
                                case 3 -> {
                                    imprimir("\n  Voc� comeu uma ma�� !");
                                    hpUsuario += 50;
                                    especial--;
                                    break;
                                }
                                default -> {
                                    System.out.println("Op��o inv�lida!");
                                }
                            }

                            if (hpPc > 0) {

                                escolha = ataquePc();

                                switch (escolha) {

                                    case 1 -> {
                                        System.out.println("\n O nativo bateu com a lan�a na sua cabe�a !\n -10 hp");
                                        hpUsuario -= 10;
                                        break;
                                    }
                                    case 2 -> {
                                        System.out.println("\n O nativo corta sua pele com a lan�a!\n -15 hp");
                                        System.out.println("");
                                        hpUsuario -= 15;
                                        break;
                                    }
                                    case 3 -> {
                                        imprimir("\n O nativo atira uma flecha em voc�!\n -20 hp");
                                        hpUsuario -= 20;
                                        break;
                                    }
                                }
                            } else {

                                System.out.println("--------------------------------------------------");
                                imprimir("Nativo derrotado! E voc� descobriu lanches na mochila para se revigorar!");
                                imprimir("Mas a saga ainda n�o acabou...");
                                System.out.println("--------------------------------------------------\n");

                                // FASE 3 //
                                imprimir("Enquanto fugia da aldeia e se afastava dos nativos, Marina descobriu uma torre de r�dio abandonada.\n ");
                                imprimir(" A torre, apesar de abandonada, demonstrava usos recentes de seus r�dios e blocos de notas.\n");
                                imprimir(" Com isso, Marina consegue entrar em contato com uma plataforma petrol�fera australiana pr�xima e descobre que h� uma pista de pouso ao norte da ilha. \n");
                                imprimir(" E, ao revirar os registros nos blocos de notas do r�dio, Marina descobre que, seu Primo Alexandre, passou por l� e anotou que escaparia para o aeroporto. \n ");
                                imprimir("Com isso, e sem perder tempo, Marina sai em dire��o ao norte da ilha. Mas ignora o fato de ter anoitecido \n ");
                                imprimir("E, na �nsia de ir embora, n�o percebe quando uma pantera negra salta diante dela �vida por carne fresca...");

                                // 3� BATALHA //
                                hpUsuario = 130;
                                hpPc = 180;
                                especial = 1;

                                while (hpUsuario > 0) {

                                    while (hpUsuario > 0 && hpPc > 0) {

                                        imprimeHp(hpUsuario, hpPc, especial);

                                        escolha = ataquepersonagem3(3, 2);

                                        switch (escolha) {

                                            case 1 -> {
                                                System.out.println("\n Voc� jogou veneno de plantas na cara dela !");
                                                hpPc -= 25;
                                                break;
                                            }
                                            case 2 -> {
                                                System.out.println("\n  Voc� chutou a cara dela!");
                                                hpPc -= 35;
                                                break;
                                            }
                                            case 3 -> {
                                                imprimir("\n Voc� comeu um p�o com mortadela");
                                                hpUsuario += 75;
                                                especial--;
                                                break;
                                            }
                                            default -> {
                                                System.out.println("Op��o inv�lida!");
                                            }
                                        }

                                        if (hpPc > 0) {

                                            escolha = ataquePc();

                                            switch (escolha) {

                                                case 1 -> {
                                                    System.out.println("\n A pantera pulou em cima e te derrubou! \n -15 hp");
                                                    hpUsuario -= 15;
                                                    break;
                                                }
                                                case 2 -> {
                                                    System.out.println("\n A pantera te cortou com as unhas afiadas\n -20 hp");
                                                    System.out.println("");
                                                    hpUsuario -= 20;
                                                    break;
                                                }
                                                case 3 -> {
                                                    imprimir("\n A pantera mordeu seu bra�o!\n -25 hp");
                                                    hpUsuario -= 25;
                                                    break;
                                                }
                                            }
                                        } else {
                                            System.out.println("--------------------------------------------------");
                                            imprimir("Ufa! A pantera fugiu e se escondeu! Agora, est� livre para seguir em frente. \n");
                                            imprimir("E ao  seguir e chegar ao aeroporto, Marina v� seu Primo Alexandre correndo e se escondendo em uma guarita do aeroporto enquanto um gorila nervoso o persegue.");
                                            imprimir("E sabe que, ent�o, para escapar da ilha e resgatar seu primo, n�o tem escolha, se n�o, confrontar o gorila.");
                                            System.out.println("--------------------------------------------------\n");

                                            int personagem = 2;
                                            desafioFinal(4, personagem);
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return menuDerrota();
    }

    static void desafioFinal(int x, int w) {
        // FASE FINAL //
        System.out.println("\n*******************");
        imprimir("�ltimo Desafio");
        System.out.println("*******************\n");

        String eFinal[][] = new String[3][3];
        //Ataques final personagem 0
        eFinal[0][0] = " Voc� acertou um tiro de pistola no peito do gorila!";
        eFinal[0][1] = " Voc� acertou um tiro de rifle no bra�o do gorila!";
        eFinal[0][2] = " Voc� fuzilou o gorila com uma metralhadora!";
        //Ataques final personagem 1
        eFinal[1][0] = " Voc� acertou um golpe com fac�o!";
        eFinal[1][1] = " Na mosca, voc� acertou uma flechada!";
        eFinal[1][2] = " Voc� acertou o gorila com um tiro de rifle!";
        //Ataques final personagem 2
        eFinal[2][0] = " Voc� jogou p� na cara do gorila!";
        eFinal[2][1] = " Voc� atirou um dardo no olho do gorila!";
        eFinal[2][2] = " Voc� comeu um belo marmitex!";

        // CHEF�O //
        int hpUsuario = 200, hpPc = 200, especial = 1, bolsa = 3;
        boolean loopMenu = true;
        while (hpUsuario > 0) {

            while (hpUsuario > 0 && hpPc > 0) {

                imprimeHp(hpUsuario, hpPc, especial);

                int escolha = 0;
                switch (w) {
                    case 0 ->
                        escolha = ataquepersonagem1(x, bolsa);
                    case 1 ->
                        escolha = ataquepersonagem2(x, bolsa);
                    case 2 ->
                        escolha = ataquepersonagem3(x, bolsa);
                }

                switch (escolha) {

                    case 1 -> {
                        System.out.println("");
                        System.out.println(eFinal[w][0]);
                        hpPc -= 5;
                    }

                    case 2 -> {
                        System.out.println("");
                        System.out.println(eFinal[w][1]);
                        hpPc -= 10;
                    }

                    case 3 -> {

                        if (especial > 0) {
                            System.out.println("");
                            System.out.println(eFinal[w][2]);
                            if (w == 0) {
                                hpPc -= 20;
                            } else if (x == 3) {
                                hpPc -= 20;
                            } else {
                                hpUsuario += 75;
                            }
                            especial--;

                        } else {

                            System.out.println("Voc� esgotou seu ataque especial");
                            loopMenu = true;
                        }

                    }

                    default ->
                        System.out.println("Op��o inv�lida!");

                }

                if (hpPc > 0) {

                    escolha = ataquePc();

                    switch (escolha) {

                        case 1 -> {
                            System.out.println("\n O gorila jogou cocos na sua cabe�a!\n");
                            hpUsuario -= 5;
                        }

                        case 2 -> {
                            System.out.println("\n Gorila pulou em cima de voc�!\n");
                            hpUsuario -= 7;
                        }

                        case 3 -> {
                            System.out.println("\n Gorila deu uma voadora em voc�!\n");
                            hpUsuario -= 15;
                        }

                    }

                } else {

                    imprimir("\n****************");
                    imprimir(" Primo Alexandre, no final das contas, � reencontrado e a fam�lia pode retornar para casa! \n");
                    imprimir(" Mas, e outros parentes esquecidos e deixados na ilha Kalahari? \n");
                    imprimir(" Ser� a busca e resgate por parentes perdidos nesta ilha um pre�o pela gan�ncia e conquista de tesouros pela Fam�lia Freitas? \n");
                    imprimir(" Nunca saberemos..... \n");
                    imprimir("****************\n");

                    creditos();

                }
            }
        }

    }

    static int ataquepersonagem1(int y, int z) {

        String[][] bolsa = new String[5][5];
        bolsa[0][0] = " Faca";
        bolsa[0][1] = " Rev�lver";
        bolsa[0][2] = " Rifle";
        bolsa[0][3] = " Metralhadora";
        bolsa[1][0] = " Soco";
        bolsa[1][1] = " Chute";
        bolsa[2][0] = " Pedra";
        bolsa[2][1] = " Pistola";
        bolsa[3][0] = " Empurr�o";
        bolsa[3][1] = " Madeira";
        bolsa[4][0] = " Pistola";
        bolsa[4][1] = " Rifle";

        System.out.println("\nEscolha seu ataque:\n");
        System.out.println("(1) " + bolsa[y][0]);
        System.out.println("(2) " + bolsa[y][1]);
        System.out.println("(3) " + bolsa[0][z]);

        return numero();

    }

    static int ataquepersonagem2(int y, int z) {

        String[][] bolsa = new String[5][5];
        bolsa[0][0] = " Fac�o";
        bolsa[0][1] = " Lan�a";
        bolsa[0][2] = " Arco e flecha";
        bolsa[0][3] = " Rifle ";
        bolsa[1][0] = " M�o ";
        bolsa[1][1] = " Tocha ";
        bolsa[2][0] = " Chute";
        bolsa[2][1] = " Tocha";
        bolsa[3][0] = " Lan�a";
        bolsa[3][1] = " Faca";
        bolsa[4][0] = " Fac�o";
        bolsa[4][1] = " Arco e flecha";

        System.out.println("\nEscolha seu ataque:\n");
        System.out.println("(1) " + bolsa[y][0]);
        System.out.println("(2) " + bolsa[y][1]);
        System.out.println("(3) " + bolsa[0][z]);
        return numero();

    }

    static int ataquepersonagem3(int y, int z) {

        String[][] bolsa = new String[5][5];
        bolsa[0][0] = " Pa�oca ";
        bolsa[0][1] = " Ma��";
        bolsa[0][2] = " P�o com Mortadela ";
        bolsa[0][3] = " Marmitex ";
        bolsa[1][0] = " Mochila ";
        bolsa[1][1] = " Chute ";
        bolsa[2][0] = " Soco";
        bolsa[2][1] = " Pedra";
        bolsa[3][0] = " Veneno";
        bolsa[3][1] = " Chute";
        bolsa[4][0] = " P�";
        bolsa[4][1] = " Dardo";

        System.out.println("\nEscolha seu ataque:\n");
        System.out.println("(1) " + bolsa[y][0]);
        System.out.println("(2) " + bolsa[y][1]);
        System.out.println("(3) " + bolsa[0][z]);
        return numero();

    }

    static boolean creditos() {

        Scanner input = new Scanner(System.in);

        System.out.println("");
        imprimir(" Muito obrigado por jogar nosso jogo KALAHARY.\n");
        imprimir(" Desenvolvedores: Leilane Nascimento\n");
        imprimir(" Desenvolvedores: Luan Silva\n");
        imprimir(" Desenvolvedores: Rafael de Souza\n");
        imprimir(" Desenvolvedores: Sema�as Lima\n");
        imprimir(" Desenvolvedores: Uriel Perrucho\n");
        imprimir(" Desenvolvedores: Wallace Wagner\n");
        imprimir(" At� a pr�xima aventura! \n");
        System.out.println("");
        System.out.println("(1) - Menu");
        System.out.println("(2) - Sair");
        System.out.println("");

        int escolha = input.nextInt();

        boolean loop = true;

        switch (escolha) {

            case 1:

                menuInicial();
                break;

            case 2:

                loop = false;
                break;

            default:

                System.out.println("Op��o inv�lida, tente novamente!");
                break;

        }
        return loop;
    }

    static boolean menuDerrota() {

        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("");
        imprimir("Voc� foi derrotado!");
        System.out.println("");
        System.out.println("-------------------------------------");
        imprimir("(1) - Menu");
        imprimir("(2) - Sair");
        System.out.println("");

        int escolha = input.nextInt();

        boolean loop = true;

        switch (escolha) {

            case 1 -> {
                loop = true;
                break;
            }
            case 2 -> {
                loop = false;
                break;
            }
            default -> {
                System.out.println("Op��o inv�lida, tente novamente!");
                loop = true;
            }
        }

        return loop;
    }
}