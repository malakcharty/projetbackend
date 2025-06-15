<h2>Projet JEE - Spring Angular JWT</h2>

<h3>Architecture du projet</h3>
<img src="captures/img.png">
<img src="captures/img_1.png">

<h3>dtos/ — Data Transfer Objects</h3>
<p>
Ce package contient toutes les classes DTO (Data Transfer Object) utilisées pour transférer les données entre le backend et le frontend ou pour les traitements métier.<br>
Chaque DTO reflète une entité mais de façon simplifiée ou enrichie.
</p>
<ul>
  <li>CustomerDTO : données d’un client</li>
  <img src="captures/img_2.png">
  <li>BankAccountDTO, SavingBankAccountDTO, CurrentBankAccountDTO : représentation des comptes</li>
    <img src="captures/img_3.png">
    <img src="captures/img_4.png">
    <img src="captures/img_5.png">
  <li>AccountOperationDTO, AccountHistoryDTO : opérations bancaires</li>
    <img src="captures/img_6.png">
    <img src="captures/img_7.png">

  <li>CreditDTO, DebitDTO, TransferRequestDTO : formulaires pour les opérations</li>
    <img src="captures/img_8.png">
    <img src="captures/img_9.png">
</ul>

<h3>entities/ — Entités JPA</h3>
<p>
Contient les entités de base du modèle relationnel, utilisées pour la persistance avec JPA.
</p>
<ul>
  <li>Customer : informations du client</li>
    <img src="captures/img_10.png">
  <li>BankAccount (classe abstraite)</li>
    <img src="captures/img_11.png">
  <li>CurrentAccount : avec découvert</li>
    <img src="captures/img_12.png">
  <li>SavingAccount : avec taux d’intérêt</li>
    <img src="captures/img_13.png">
  <li>AccountOperation : opérations bancaires (crédit/débit)</li>
    <img src="captures/img_14.png">
</ul>
<h3>enums/ — Types énumérés</h3>
<p>
Ce dossier contient les énumérations utilisées dans le projet.
</p>
<ul>
  <li>AccountStatus : statut d’un compte bancaire</li>
    <img src="captures/img_15.png">
  <li>OperationType : CREDIT ou DEBIT</li>
    <img src="captures/img_16.png">
</ul>
<h3>exceptions/ — Exceptions personnalisées</h3>
<p>
Contient les classes d’exceptions spécifiques levées lors des erreurs métier.
</p>
<ul>
  <li>BalanceNotSufficientException</li>
    <img src="captures/img_17.png">
  <li>BankAccountNotFoundException</li>
    <img src="captures/img_18.png">
  <li>CustomerNotFoundException</li>
    <img src="captures/img_19.png">
</ul>
<h3>mappers/ — DTO ↔ Entity</h3>
<p>
Utilise MapStruct pour convertir automatiquement les entités vers les DTOs et inversement.
</p>
<ul>
  <li>BankAccountMapperImpl</li>
    <img src="captures/img_20.png">
    <img src="captures/img_21.png">
    <img src="captures/img_22.png">
</ul>

<h3>repositories/ — Accès à la base de données</h3>
<p>
Contient les interfaces Spring Data JPA pour manipuler les entités.
</p>
<ul>
  <li>CustomerRepository</li>
    <img src="captures/img_23.png">
  <li>BankAccountRepository</li>
    <img src="captures/img_24.png">
  <li>AccountOperationRepository</li>
    <img src="captures/img_25.png">
</ul>

<h3>services/ — Couche métier</h3>
<p>
Gère la logique métier du projet.
</p>
<ul>
  <li>BankAccountService (interface)</li>
    <img src="captures/img_26.png">
    <img src="captures/img_27.png">
  <li>BankAccountServiceImpl (implémentation)</li>
    <img src="captures/img_28.png">
    <img src="captures/img_29.png">
    <img src="captures/img_30.png">
    <img src="captures/img_31.png">
    <img src="captures/img_32.png">
    <img src="captures/img_33.png">
    <img src="captures/img_34.png">

  <li>BankService : logique générale sur les comptes</li>
    <img src="captures/img_35.png">

</ul>

<h3>web/ — API REST</h3>
<p>
Expose les endpoints REST pour interagir avec les entités via HTTP.
</p>
<ul>
  <li>BankAccountRestAPI</li>
    <img src="captures/img_36.png">
    <img src="captures/img_37.png">

  <li>CustomerRestController</li>
    <img src="captures/img_38.png">
</ul>

<h3>EBankingBackendApplication.java</h3>
<p>
Point d’entrée principal de l’application Spring Boot avec l’annotation <code>@SpringBootApplication</code>.
</p>
    <img src="captures/img_39.png">
    <img src="captures/img_40.png">
<h3>resources/</h3>
<p>
Contient les fichiers de configuration de l’application.
</p>
<ul>
  <li><code>application.properties</code> : configuration des ports, de la base de données, des logs, etc.</li>
    <img src="captures/img_41.png">
</ul>
<h3>Test de l'API avec Swagger UI/</h3>
<p>Cette capture présente tous les endpoints exposés par le backend :</p>
    <img src="captures/img_42.png">
    <img src="captures/img_43.png">
<h3>Liste des clients (`GET /customers`)</h3>
<p>Cette capture montre le résultat de la récupération de tous les clients enregistrés :</p>
    <img src="captures/img_44.png">
