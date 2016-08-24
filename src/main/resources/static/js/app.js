$(function() {
    $('#comments-container').comments({
        maxRepliesVisible: 5,
        profilePictureURL: 'https://viima-app.s3.amazonaws.com/media/user_profiles/user-icon.png',
        roundProfilePictures: true,
        textareaPlaceholderText: 'Deja un comentario',
        newestText: 'Nuevo',
        oldestText: 'Antiguo',
        popularText: 'Más popular',
        attachmentsText: 'Mostrar adjuntos',
        sendText: 'Comentar',
        replyText: 'Responder',
        editText: 'Modificar',
        editedText: 'Modificado',
        youText: 'Yo',
        saveText: 'Actualizar',
        deleteText: 'Borrar',
        viewAllRepliesText: 'Mostrar todas las respuestas (__replyCount__)',
        hideRepliesText: 'Ocultar',
        noCommentsText: 'No hay comentarios',
        noAttachmentsText: 'No hay adjuntos',
        attachmentDropText: 'Arrastre aquí',
        enableReplying: false,
        textareaRows: 1,
        enableAttachments: false,
        enableEditing: true,
        enableUpvoting:false,
        fieldMappings: {
            id: 'id',
            parent: 'parent',
            created: 'created',
            modified: 'modified',
            content: 'content',
            file: 'file',
            fileURL: 'fileUrl',
            fileMimeType: 'fileMimeYype',
            fullname: 'fullname',
            profileURL: 'profileUrl',
            profilePictureURL: 'profilePictureUrl',
            createdByAdmin: 'createdByAdmin',
            createdByCurrentUser: 'createdByCurrentUser',
            upvoteCount: 'upvoteCount',
            userHasUpvoted: 'userHasUpvoted'
        },
        getComments: function(success, error) {
            $.ajax({
                type: 'get',
                url: '/api/comments/',
                success: function(commentsArray) {
                    success(commentsArray._embedded.comments)
                },
                error: function(commentsArray) {
                   console.log(error);
               }
            });
        },
        postComment: function(commentJSON, success, error) {
            $.ajax({
                type: 'post',
                url: '/api/comments/',
                data: JSON.stringify(commentJSON),
                contentType: "application/json",
                success: function(comment) {
                    success(comment)
                },
                error: error
            });
        },
        putComment: function(commentJSON, success, error) {
            $.ajax({
                type: 'put',
                url: '/api/comments/' + commentJSON.id,
                data: JSON.stringify(commentJSON),
                contentType: "application/json",
                success: function(comment) {
                    success(comment)
                },
                error: error
            });
        },
        deleteComment: function(commentJSON, success, error) {
            $.ajax({
                type: 'delete',
                url: '/api/comments/' + commentJSON.id,
                contentType: "application/json",
                success: success,
                error: error
            });
        },
        uploadAttachments: function(dataArray, success, error) {
            setTimeout(function() {
                success(dataArray);
            }, 500);
        }
    });
});