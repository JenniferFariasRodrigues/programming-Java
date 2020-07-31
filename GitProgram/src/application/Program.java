/* Demo criar um novo projeto
ATENÇÃO USUÁRIOS WINDOWS= configurar o sistema para mostrar extensões de arquivos
Painel de controle/Opções de pasta/ Modo de exibição
 Desmarcar "Ocultar as extensões de tipos de arquivos conhecidos"
Passos
1. Crie um novo projeto no seu ambiente de desenvolvimento
2. Crie um novo repositório no Github
a. ATENÇÃO= se seu ambiente de desenvolvimento não gera o arquivo .gitignore
automaticamente, escolha o seu tipo desejado de .gitignore na tela de criação de repositório do
Github
3. Abra um terminal na pasta do seu projeto
4. IMPORTANTE: certifique-se de estar identificado no Git do seu computador (nome e email)
git config --list
git config --global user.name "Nelio Alves"
git config --global user.email "acenelio@gmail.com"
5. Faça os comandos a seguir
-git init Inicia um novo repositório local na
pasta do seu projeto
-git remote add origin https://github.com/acenelio/meuprojeto.git
ATENÇÃO: troque pelo caminho do seu repositório do Github
Associa seu repositório local ao repositório
remoto, com o apelido de "origin" git pull origin master
ATENÇÃO: este comando só é necessário se você criou o .gitignore pelo Github
Atualiza seu repositório local em relação ao repositório remoto
- git status Verifica arquivos
- git add . Adiciona todos arquivos ao stage
-git commit -m "Projeto criado" Salva uma nova versão do projeto
- git push -u origin master
Nota: nas próximas vezes basta fazer: git push Envia o repositório local para o repositório
remoto

Demo - Trabalhando com um projeto existente
Passos:
1. IMPORTANTE: certifique-se de estar identificado no Git do seu computador (nome e email)
USUÁRIOS WINDOWS: verifique o "Cofre" (gerenciador de credenciais)
git config --list
git config --global user.name "Nelio Alves"
git config --global user.email "acenelio@gmail.com"
2. Se o projeto já não estiver no seu computador, Clonar o repositório do Github
git clone https://github.com/acenelio/meuprojeto.git
3. Altere o que você precisar no projeto
4. Commitar as mudanças feitas no projeto
4.1. Verificar arquivos:
git status

4.2. Realizar o commit:
git add .
git commit -m "Mensagem explicativa"
4.3. Listar histórico de commits:
git log --oneline
5. Salvar projeto atualizado no seu Github (push)
git push
*/

package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi. How are you?");
		System.out.println("Tell me about you,please");
		System.out.println("Good night");
	}

}
